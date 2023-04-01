package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaProductoSeleccionado extends PageObject {

    public static final Target BOTON_AGREGAR = Target.the("Producto Seleccionado")
            .located(By.xpath("//button[contains(.,'Agregar')]"));

    public static final Target BOTON_CARRITO = Target.the("Boton carrito")
            .located(By.xpath("//a[@class='exito-header-3-x-minicartLink']"));


}
