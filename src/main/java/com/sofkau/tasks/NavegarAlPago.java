package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.CarritoDeCompras.BOTON_IR_A_PAGAR;
import static com.sofkau.ui.PaginaProductoSeleccionado.BOTON_AGREGAR;
import static com.sofkau.ui.PaginaProductoSeleccionado.BOTON_CARRITO;


public class NavegarAlPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_AGREGAR),
                Click.on(BOTON_CARRITO),
                Click.on(BOTON_IR_A_PAGAR)
        );
    }

    public static NavegarAlPago navegarAlPago(){
        return new NavegarAlPago();
    }
}
