package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.PaginaDeBusqueda.IMAGEN_PRODUCTO;
import static com.sofkau.ui.PaginaProductoSeleccionado.BOTON_AGREGAR;

public class SeleccionarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(IMAGEN_PRODUCTO),
                Click.on(IMAGEN_PRODUCTO)
        );
    }

    public static SeleccionarProducto seleccionarProducto(){
        return new SeleccionarProducto();
    }
}
