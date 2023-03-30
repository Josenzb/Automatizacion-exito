package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;


import static com.sofkau.ui.PaginaInicial.BOTON_TIPO_ENVIO;
import static com.sofkau.ui.PaginaSetDireccion.*;

public class SetDireccion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_TIPO_ENVIO),
                Click.on(CAMPO_CIUDAD),
                Hit.the(Keys.ENTER).into(CAMPO_CIUDAD),
                Click.on(CAMPO_TIENDA),
                Hit.the(Keys.ENTER).into(CAMPO_TIENDA),
                Click.on(BOTON_CONINUAR)
        );
    }

    public static SetDireccion setDireccion(){
        return new SetDireccion();
    }
}
