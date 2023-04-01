package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioDePago extends PageObject {

    public static final Target CAMPO_FIRSTNAME = Target.the("Campo nombre cliente")
            .located(By.id("client-first-name"));

    public static final Target CAMPO_LASTNAME = Target.the("Campo apellido cliente")
            .located(By.id("client-last-name"));

    public static final Target CAMPO_CELULAR = Target.the("Campo celular cliente")
            .located(By.id("client-phone"));

    public static final Target CAMPO_CEDULA = Target.the("Campo cedula cliente")
            .located(By.id("client-new-document"));

    public static final Target BOTON_CONTINUAR_DATOS = Target.the("Boton continuar de datos")
            .located(By.id("go-to-shipping"));

    public static final Target REFERENCIA_FECHA = Target.the("Div de referencia para la fecha")
            .located(By.xpath("//div[text()='Paquete 1']"));

    public static final Target BOTON_SELECCIONAR_FECHA = Target.the("Boton seleccionar fecha")
            .located(By.id("scheduled-delivery-choose-CompraRecoge_Programado-(ptorecogida_086)"));

    public static final Target FECHA_SELECCIONADA = Target.the("Fecha Seleccionada")
            .located(By.xpath("//div[@aria-label='day-3']"));

    public static final Target BOTON_CONTINUAR_FECHA = Target.the("Boton guardar fecha")
            .located(By.id("btn-go-to-payment"));

    public static final Target OPCION_DE_PAGO = Target.the("Boton de pago PSE")
            .located(By.xpath("//span[text()='PSE']"));

    public static final  Target BOTON_PAGAR = Target.the("boton pagar")
            .located(By.xpath("(//button[@id='payment-data-submit'])[2]"));

}
