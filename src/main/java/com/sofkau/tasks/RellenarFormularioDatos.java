package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.FormularioDePago.*;

public class RellenarFormularioDatos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(CAMPO_FIRSTNAME),
                Enter.theValue("Jose").into(CAMPO_FIRSTNAME),
                Clear.field(CAMPO_LASTNAME),
                Enter.theValue("Bernal").into(CAMPO_LASTNAME),
                Clear.field(CAMPO_CELULAR),
                Enter.theValue("315 469 1235").into(CAMPO_CELULAR),
                Clear.field(CAMPO_CEDULA),
                Enter.theValue("89562315").into(CAMPO_CEDULA),
                Click.on(BOTON_CONTINUAR_DATOS)
        );
    }

    public static RellenarFormularioDatos rellenarFormularioDatos(){
        return new RellenarFormularioDatos();
    }
}
