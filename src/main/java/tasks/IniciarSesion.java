package tasks;

import models.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.IniciarSesionPage;



public class IniciarSesion implements Task {

private Credenciales credenciales;
    public IniciarSesion(Credenciales credenciales) {
        this.credenciales = credenciales;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(IniciarSesionPage.INICIAR_SESION),
                Click.on(IniciarSesionPage.INICIAR_SESION_TWO),
                Enter.theValue(credenciales.getUsuario()).into(IniciarSesionPage.USUARIO),
                Enter.theValue(credenciales.getContrasena()).into(IniciarSesionPage.CONTRASENA),
                Click.on(IniciarSesionPage.ENTRAR)

        );
    }
    public static IniciarSesion onThePage(Credenciales credenciales) {

        return Tasks.instrumented(IniciarSesion.class,credenciales);
    }


    }

