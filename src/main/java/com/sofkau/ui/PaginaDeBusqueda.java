package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaDeBusqueda extends PageObject {

    public static final Target PRODUCTO_SELECCIONADO = Target.the("Producto Seleccionado")
            .located(By.xpath("(//button[contains(@class,'vtex-button') and contains(@class,'bg-action-primary')]//span[@class='exito-vtex-components-4-x-buttonText'])[4]"));

}
