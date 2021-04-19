package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.travelocity.com/")

public class BusquedaHotelPage extends PageObject {
    public static final Target NOMBRE_HOTEL= Target.the("clien en buscar hotel").locatedBy("//*[@class='uitk-faux-input']");
    public static final Target ESCRIBIR_NOMBRE= Target.the("nombre del hotel a buscar").locatedBy("//input[@placeholder='Where are you going?']");
    public static final Target SELECCIONAR_NOMBRE= Target.the("Seleccionar nombre del hotel a buscar").locatedBy("//button[@class='uitk-button uitk-button-small uitk-button-fullWidth uitk-button-typeahead uitk-type-left has-subtext']");

    public static final Target CHECK_IN= Target.the("Fecha de entrada").locatedBy("//button[@id='d1-btn']");
    public static final Target CHECK_OUT= Target.the("fecha de salida").locatedBy("//button[@id='d2-btn']");
    public static final Target SELECCIOMN_FECHAE= Target.the("seleccion entrada").locatedBy("//button[@aria-label='May 2, 2021 selected, current check out date.']");
    public static final Target SLECCION_FECHAS= Target.the("seleccion salida").locatedBy("//button[@aria-label='May 3, 2021 selected, current check out date.']");
    public static final Target DONE= Target.the("boton de done").locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target VIAJEROS= Target.the("numero de viajeros").locatedBy("//button[@data-testid='travelers-field-trigger']");

    public static final Target DONET= Target.the("boton done dos").locatedBy("//button[@data-testid='guests-done-button']");
    public static final Target BUSCAR= Target.the("boton BUSCAR").locatedBy("//button[@data-testid='submit-button']");
    public static final Target HOTEL= Target.the("resultado").locatedBy("//div[@class='uitk-grid all-cell-fill all-cell-align-top' and @xpath='1']");
    public static final Target NOMBRE_H= Target.the("seleccionar busqueda").locatedBy("//li[@data-index='0']");
    public static final Target CARRO= Target.the("seleccionar busqueda").locatedBy("//input[@type='checkbox' and @id='add-car-switch']");
}
