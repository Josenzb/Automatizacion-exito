package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.sofkau.ui.PaginaInicial.*;

public class BuscarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_MERCADO),
                Enter.theValue("Salchichon").into(CAMPO_BUSQUEDA),
                Click.on(BOTON_BUSCAR)
        );
    }

    public static BuscarProducto buscarProducto(){
        return new BuscarProducto();
    }
}
