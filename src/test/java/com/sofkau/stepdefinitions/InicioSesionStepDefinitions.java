package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import java.io.IOException;
import java.util.List;

import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.util.SetVeriables.getUserPasword;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioSesionStepDefinitions extends Configuracion {

    private List<String> credenciales = getUserPasword();

    public InicioSesionStepDefinitions() throws IOException {
    }

    @Dado("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()
        );
    }

    @Cuando("completa los campos para iniciar sesion")
    public void completaLosCamposParaIniciarSesion() {
        theActorInTheSpotlight().wasAbleTo(
                iniciarSesion().conElUsuario(credenciales.get(0))
                        .yConLaContrasenna(credenciales.get(1))
        );
    }

    @Entonces("el usuario iniciara sesion y vera un mensaje de bienvenida")
    public void elUsuarioIniciaraSesionYVeraUnMensajeDeBienvenida() {

    }

}
