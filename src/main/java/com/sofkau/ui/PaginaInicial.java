package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {

    public static final Target BOTON_CUENTA = Target.the("Boton mi cuenta")
            .located(By.cssSelector(".vtex-menu-2-x-styledLinkIcon.vtex-menu-2-x-styledLinkIcon--header-link.mh2"));

    public static final Target BOTON_INICIO_USER_PASS = Target.the("Boton inicar con usuario y contrasena")
            .located(By.xpath("//div[contains(@class,'vtex-login-2-x-button vtex-login-2-x-emailPasswordOptionBtn')]//button[contains(@type,'button')]"));

    public static final Target CAMPO_USUARIO = Target.the("Campo escribir usuario")
            .located(By.xpath("//input[contains(@placeholder,'Ingresa tu email')]"));

    public static final Target CAMPO_CONTRASENNA = Target.the("Campo escribir usuario")
            .located(By.xpath("//input[@placeholder='Ingresa tu contraseña']"));

    public static final Target BOTON_INICIAR_SESION = Target.the("Boton mi cuenta")
            .located(By.cssSelector(".vtex-button.bw1.ba.fw5.v-mid.relative.pa0.lh-solid.br2.min-h-small.t-action--small.bg-action-primary.b--action-primary.c-on-action-primary.hover-bg-action-primary.hover-b--action-primary.hover-c-on-action-primary.pointer"));

}
