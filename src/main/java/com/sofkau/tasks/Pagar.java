package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.FormularioDePago.BOTON_PAGAR;

public class Pagar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PAGAR)
        );
    }
    public static Pagar pagar(){
        return new Pagar();
    }
}
