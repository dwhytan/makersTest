package tasks.navigate;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userInterface.makersHomePage;

public class GoTo {
    public static Performable theHomePage() {
        return Task.where("{0} entra a la página principal",
                Open.browserOn().thePageNamed("home.page")
        );
    }

    public static Performable contactPage() {
        return Task.where("{0} va hacia Contacto",
                Click.on(makersHomePage.CONTACTO_SECCION_BTN));
    }
}
