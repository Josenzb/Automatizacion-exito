package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofkau.ui.FormularioDePago.*;

public class SeleccionarFechaEntrega implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(REFERENCIA_FECHA),
                Click.on(BOTON_SELECCIONAR_FECHA),
                Click.on(FECHA_SELECCIONADA),
                Click.on(BOTON_CONTINUAR_FECHA)
        );
    }

    public static SeleccionarFechaEntrega seleccionarFechaEntrega(){
        return new SeleccionarFechaEntrega();
    }
}
