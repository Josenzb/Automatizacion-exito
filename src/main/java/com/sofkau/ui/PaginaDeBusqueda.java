package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaDeBusqueda extends PageObject {

    public static final Target BOTON_ORDENAR = Target.the("Boton ordenar por")
            .located(By.xpath("(//span[@class='vtex-search-result-3-x-orderByText c-muted-2'])[1]"));

    public static final Target ORDENAR_MAYOR_PRECIO = Target.the("Boton ordenar por")
            .located(By.xpath("//button[normalize-space()='Mayor precio primero']"));

    public static final Target IMAGEN_PRODUCTO = Target.the("Producto Seleccionado")
            .located(By.xpath("(//img[@alt='Salchichon cervecero premium x 500  gr'])[1]"));
}
