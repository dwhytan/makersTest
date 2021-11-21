package tasks.form;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import userInterface.contactoPage;

public class fillOut {

    private static final EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

    private static final String NOMBRE = EnvironmentSpecificConfiguration.from(variables).getProperty("formulario.nombre");
    private static final String APELLIDO = EnvironmentSpecificConfiguration.from(variables).getProperty("formulario.apellido");
    private static final String EMAIL = EnvironmentSpecificConfiguration.from(variables).getProperty("formulario.email");
    private static final String CELULAR = EnvironmentSpecificConfiguration.from(variables).getProperty("formulario.celular");


    public static Performable theContactForm(String MENSAJE) {
        return Task.where("{0} llena el formulario de Contacto",
                Enter.theValue(NOMBRE).into(contactoPage.FORMULARIO_NOMBRE),
                Enter.theValue(APELLIDO).into(contactoPage.FORMULARIO_APELLIDO),
                Enter.theValue(EMAIL).into(contactoPage.FORMULARIO_EMAIL),
                Enter.theValue(CELULAR).into(contactoPage.FORMULARIO_CELULAR),
                Enter.theValue(MENSAJE).into(contactoPage.FORMULARIO_MENSAJE));
    }
}
