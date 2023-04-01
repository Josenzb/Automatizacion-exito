package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoDeCompras extends PageObject {

    public static final Target BOTON_IR_A_PAGAR = Target.the("Boton ir a pagar")
            .located(By.xpath("//a[@href='#/orderform']"));
}
