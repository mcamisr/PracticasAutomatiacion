package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import models.BusquedaHotel;
import models.Credenciales;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.BuscarHotel;
import tasks.BuscarHotelCar;
import tasks.IniciarSesion;
import userinterfaces.BusquedaHotelPage;
import userinterfaces.IniciarSesionPage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BucarHotelStepDefinition {
    private BusquedaHotelPage page2;

    @Before
    public void prepareStage() {

        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que navego por la pagina$")
    public void queNavegoPorLaPagina() {
        OnStage.theActorCalled("cami").wasAbleTo(Open.browserOn(page2));
    }


    @Cuando("^Busco ingreso un nombre de hotel$")
    public void buscoIngresoUnNombreDeHotel(List<BusquedaHotel> hotel) {
  BusquedaHotel hotels = hotel.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo((BuscarHotel.onThePage(hotels)));
    }


    @Entonces("^deberia ver el precio e informacion del hotel$")
    public void deberiaVerElPrecioEInformacionDelHotel() {
        OnStage.theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(BusquedaHotelPage.HOTEL), WebElementStateMatchers.isVisible()));
    }
    @Cuando("^Busco ingreso un nombre de hotel y selecciono carro$")
    public void busco_ingreso_un_nombre_de_hotel_y_selecciono_carro(List<BusquedaHotel> hotel) {
        BusquedaHotel hotels = hotel.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo((BuscarHotelCar.onThePage(hotels)));
    }

    @Entonces("^deberia ver el precio e informacion del hotel y carro$")
    public void deberia_ver_el_precio_e_informacion_del_hotel_y_carro() {
        //OnStage.theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(BusquedaHotelPage.HOTEL), WebElementStateMatchers.isVisible()));

    }
}
