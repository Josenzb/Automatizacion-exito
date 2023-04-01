package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.MensajeFinal.MENSAJE_FINAL_COMPRA;


public class MensajeFinal implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_FINAL_COMPRA.resolveFor(actor).getText();
    }

    public static MensajeFinal mensajeFinal(){
        return new MensajeFinal();
    }
}
