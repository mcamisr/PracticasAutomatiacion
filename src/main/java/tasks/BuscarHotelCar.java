package tasks;

import models.BusquedaHotel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.BusquedaHotelPage;

public class BuscarHotelCar implements Task {
    private BusquedaHotel buscar;
    public BuscarHotelCar(BusquedaHotel buscar){
        this.buscar = buscar;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(BusquedaHotelPage.NOMBRE_HOTEL),
                Enter.theValue(buscar.getHotel()).into(BusquedaHotelPage.ESCRIBIR_NOMBRE),
                Click.on(BusquedaHotelPage.NOMBRE_H),
                Click.on(BusquedaHotelPage.CHECK_IN),
                Click.on(BusquedaHotelPage.SELECCIOMN_FECHAE),
                Click.on(BusquedaHotelPage.DONE),
                Click.on(BusquedaHotelPage.CHECK_OUT),
                Click.on(BusquedaHotelPage.SLECCION_FECHAS),
                Click.on(BusquedaHotelPage.DONE),
                Click.on(BusquedaHotelPage.VIAJEROS),
                Click.on(BusquedaHotelPage.DONET),
                Click.on(BusquedaHotelPage.CARRO),
                Click.on(BusquedaHotelPage.BUSCAR)
        );
    }

    public static BuscarHotelCar onThePage(BusquedaHotel buscar) {

        return Tasks.instrumented(BuscarHotelCar.class,buscar);
    }
}
