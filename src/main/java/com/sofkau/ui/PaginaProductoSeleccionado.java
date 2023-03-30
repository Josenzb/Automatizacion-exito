package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaProductoSeleccionado {

    public static final Target BOTON_COMPRAR = Target.the("Producto Seleccionado")
            .located(By.xpath("//button[contains(@class,'vtex-button') and contains(., 'Comprar ahora')]"));


}
