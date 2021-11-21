package stepDefinitions.pruebaTecnica;

import abilities.useMySQL;
import com.google.common.truth.Truth;
import io.cucumber.java.es.*;
import model.portafolio;
import model.servicioCliente;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import questions.makersServicioCelular;
import tasks.form.fillOut;
import tasks.form.send;
import tasks.navigate.GoTo;

public class automationSD {
    // Primer Escenario

    portafolio p;
    servicioCliente s;
    float resultado;

    @Dado("que {actor} insertará los siguientes registros, con parámetros: {string}, {string}, {string}, {string}, {string}")
    public void actor_debe_insertar_registros(Actor actor, String arg0, String arg1, String arg2, String arg3, String arg4) {
        // Insertando en BD
        useMySQL.insertarRegistro(arg0, arg1, Float.parseFloat(arg2), Float.parseFloat(arg3), Float.parseFloat(arg4));

        // Almacenando en memoria
        p = new portafolio(arg0, arg1, Float.parseFloat(arg2), Float.parseFloat(arg3), Float.parseFloat(arg4));
    }

    @Entonces("{actor} calculará el valor total")
    public void actor_calcular_total(Actor actor) {
        if  (p.getPORTAFOLIO().equals("OBL-RIESGO")) {
            resultado = (p.getNOMINAL() * p.getPRECIO()) +2000;
            System.out.println("Calculando total: ("+ p.getNOMINAL() +" * "+ p.getPRECIO() +") + 2000 = "+ resultado );
        } else {
            resultado = p.getNOMINAL() * p.getPRECIO();
            System.out.println("Calculando total: "+ p.getNOMINAL() +" * "+ p.getPRECIO() +" = "+ resultado );
        }
    }

    @Y("validará que el valor total calculado sea igual al campo total de la base de datos")
    public void actor_valida_total() {
        Truth.assertThat(resultado).isEqualTo(p.getTOTAL());
    }

    // Segundo Escenario

    @Dado("que {actor} ingresa a Makers")
    public void actor_ingresa_a_Makers(Actor actor) {
        actor.wasAbleTo(GoTo.theHomePage());
    }

    @Cuando("{actor} hace clic en CONTACTO")
    public void actor_selecciona_contacto(Actor actor) {
        actor.attemptsTo(GoTo.contactPage());
    }

    @Entonces("{actor} debe capturar el número de celular de servicio al cliente")
    public void actor_captura_cel(Actor actor) {
        s = new servicioCliente(makersServicioCelular.servicioClienteCelular().answeredBy(actor));
    }

    @Y("{actor} llenará el formulario {string}, y en el campo mensaje adjuntará el numero de celular capturado")
    public void actor_llena_formulario(Actor actor, String arg0) {
        actor.attemptsTo(fillOut.theContactForm(s.getCELULAR()));
    }

    @Y("antes de hacer clic en el boton {string}, {actor} toma un pantallazo con la informacion diligenciada")
    public void actor_captura_y_envia(String arg0, Actor actor) {
        Serenity.takeScreenshot();
        actor.attemptsTo(send.theContactForm());
    }
}
