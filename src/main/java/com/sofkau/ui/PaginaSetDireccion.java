package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaSetDireccion extends PageObject {

    public static final Target CAMPO_CIUDAD = Target.the("Boton seleccionar ciudad")
            .located(By.xpath("//input[@aria-autocomplete='list']"));

    public static final Target CAMPO_TIENDA = Target.the("Boton seleccionar tienda")
            .located(By.xpath("(//input[@type='text' and @aria-autocomplete='list'])[2]"));

    public static final Target BOTON_CONINUAR = Target.the("Boton continuar")
            .located(By.xpath("//button[@class='exito-geolocation-3-x-primaryButtonEnable']"));
}
