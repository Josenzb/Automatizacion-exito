package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.sofkau.ui.PaginaInicial.BOTON_CUENTA;

public class IniciarSesion implements Task {

    private String usuario;
    private String contrasenna;

    public void setUserPasword() throws IOException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream("C:/Users/nunez/Escritorio/Nueva carpeta/Automatizacion Exito/ScreenPlay Exito/src/test/resources/Properties.xml");
        prop.loadFromXML(input);
        usuario = prop.getProperty("USER");
        contrasenna = prop.getProperty("PASSWORD");
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            setUserPasword();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(BOTON_CUENTA)
                /*,
                Enter.theValue(usuario).into(CAMPO_USUARIO),
                Enter.theValue(contrasenna).into(CAMPO_CONTRASENNA),
                Click.on(BOTON_INICIAR_SESION)*/
        );
    }

    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}
