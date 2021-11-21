package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class contactoPage {
    public static Target SERVICIO_CLIENTE_CELULAR = Target.the("Servicio al Cliente - Label")
            .locatedBy("//a[@title = 'celular']");
    public static Target FORMULARIO_NOMBRE = Target.the("Formulario: Nombre - Textfield")
            .locatedBy("//input[@placeholder = 'Nombre']");
    public static Target FORMULARIO_APELLIDO = Target.the("Formulario: Apellido - Textfield")
            .locatedBy("//input[@placeholder = 'Apellido']");
    public static Target FORMULARIO_EMAIL = Target.the("Formulario: Email - Textfield")
            .locatedBy("//input[@placeholder = 'Email']");
    public static Target FORMULARIO_CELULAR = Target.the("Formulario: Celular - Textfield")
            .locatedBy("//input[@placeholder = 'Teléfono']");
    public static Target FORMULARIO_MENSAJE = Target.the("Formulario: Mensaje - TextArea")
            .locatedBy("//textarea[@placeholder = 'Mensaje']");
    public static Target FORMULARIO_ENVIAR = Target.the("Formulario: Enviar - Botón")
            .locatedBy("//button[text() = 'Enviar Mensaje']");

    public static Target FORMULARIO_EXITO = Target.the("Formulario: Mensaje Enviado - Label")
            .locatedBy("//p[.= '¡Mensaje enviado!']");
}
