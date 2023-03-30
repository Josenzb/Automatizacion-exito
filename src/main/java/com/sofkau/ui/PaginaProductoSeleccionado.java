package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaProductoSeleccionado {

    public static final Target BOTON_COMPRAR = Target.the("Producto Seleccionado")
            .located(By.xpath("(//span[@class='exito-vtex-components-4-x-buttonText'])[2]"));


}
