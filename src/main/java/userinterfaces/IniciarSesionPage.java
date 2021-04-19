package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("https://www.travelocity.com/")



public class IniciarSesionPage extends PageObject {
    public static final Target INICIAR_SESION= Target.the("iniciar sesion").locatedBy("//div[contains(text(),'Sign in')]");
    public static final Target INICIAR_SESION_TWO= Target.the("iniciar sesion2").locatedBy("//a[contains(text(),'Sign in')]");
    public static final Target USUARIO= Target.the("   usuario").locatedBy("//input[@id='signin-loginid']");
    public static final Target CONTRASENA= Target.the("contraseña").locatedBy("//input[@id='signin-password']");
    public static final Target ENTRAR= Target.the("Boton de loggear").locatedBy("//button[@id='submitButton']");
    public static final Target ERRROR= Target.the("mensaje de error").locatedBy(" //div[@id='wrong-credentials-error-div']");


}


