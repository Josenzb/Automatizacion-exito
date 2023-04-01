package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.FormularioDePago.*;

public class SeleccionarMetodoPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_DE_PAGO),
                Scroll.to(REFERENCIA_FECHA)
        );
    }

    public static SeleccionarMetodoPago seleccionarMetodoPago(){
        return new SeleccionarMetodoPago();
    }
}
