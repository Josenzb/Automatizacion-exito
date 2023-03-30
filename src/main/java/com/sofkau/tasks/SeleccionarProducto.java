package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebElement;


import static com.sofkau.ui.PaginaDeBusqueda.PRODUCTO_SELECCIONADO;
import static com.sofkau.ui.PaginaInicial.*;
import static com.sofkau.ui.PaginaProductoSeleccionado.BOTON_COMPRAR;

public class SeleccionarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_MERCADO),
                Enter.theValue("Salchichon").into(CAMPO_BUSQUEDA),
                Click.on(BOTON_BUSCAR),
                Click.on(PRODUCTO_SELECCIONADO),
                Click.on(BOTON_COMPRAR)
        );
    }

    public static SeleccionarProducto seleccionarProducto(){
        return new SeleccionarProducto();
    }
}
