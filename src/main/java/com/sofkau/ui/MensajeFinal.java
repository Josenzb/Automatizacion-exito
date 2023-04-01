package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeFinal extends PageObject {

    public static final Target MENSAJE_FINAL_COMPRA = Target.the("Mensaje final de compra")
            .located(By.cssSelector("body div div div div div h3 strong"));
}
