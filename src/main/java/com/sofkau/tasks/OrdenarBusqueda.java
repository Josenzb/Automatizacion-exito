package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaDeBusqueda.BOTON_ORDENAR;
import static com.sofkau.ui.PaginaDeBusqueda.ORDENAR_MAYOR_PRECIO;

public class OrdenarBusqueda implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ORDENAR),
                Click.on(ORDENAR_MAYOR_PRECIO)
        );
    }

    public static OrdenarBusqueda ordenarBusqueda(){
        return new OrdenarBusqueda();
    }
}
