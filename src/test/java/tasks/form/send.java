package tasks.form;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.contactoPage;

public class send {
    public static Performable theContactForm() {
        return Task.where("{0} envia formulario de Contacto",
                Click.on(contactoPage.FORMULARIO_ENVIAR),
                WaitUntil.the(contactoPage.FORMULARIO_EXITO, WebElementStateMatchers.isVisible()));
    }
}
