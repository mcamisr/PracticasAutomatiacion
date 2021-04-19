package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import models.Credenciales;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.IniciarSesion;
import userinterfaces.IniciarSesionPage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class IniciarSesionStepDefinition {


  private IniciarSesionPage page;
    @Before
    public void prepareStage() {

        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que ingreso a la pagina de travelocity$")
    public void queIngresoALaPaginaDeTravelocity() {
            OnStage.theActorCalled("cami").wasAbleTo(Open.browserOn(page));
    }

    @Cuando("^ingreso mis credenciales incorrectas$")
    public void ingresoMisCredencialesIncorrectas( List<Credenciales> credenciales) {
      Credenciales credencial = credenciales.get(0);
     OnStage.theActorInTheSpotlight().attemptsTo((IniciarSesion.onThePage(credencial)));
    }

    @Entonces("^debe aparecer un mensaje de error$")
    public void debeAparecerUnMensajeDeError() {
     OnStage.theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(IniciarSesionPage.ERRROR), WebElementStateMatchers.isVisible()));


    }
}
