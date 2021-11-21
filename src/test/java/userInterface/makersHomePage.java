package userInterface;

import net.serenitybdd.screenplay.targets.Target;
public class makersHomePage {
    public static Target CONTACTO_SECCION_BTN = Target.the("Contacto - Botón")
            .locatedBy("//ul[@id='menu-principal']//a[text()= 'Contacto']");
}
