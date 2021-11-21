package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterface.contactoPage;

public class makersServicioCelular {
    public static Question<String> servicioClienteCelular () {
        return Text.of(contactoPage.SERVICIO_CLIENTE_CELULAR).asAString();
    }
}
