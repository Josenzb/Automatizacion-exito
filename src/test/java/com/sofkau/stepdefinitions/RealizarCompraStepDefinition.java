package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.List;

import static com.sofkau.questions.MensajeFinal.mensajeFinal;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.BuscarProducto.buscarProducto;
import static com.sofkau.tasks.NavegarAlPago.navegarAlPago;
import static com.sofkau.tasks.OrdenarBusqueda.ordenarBusqueda;
import static com.sofkau.tasks.Pagar.pagar;
import static com.sofkau.tasks.RefrescarPagina.refrescarPagina;
import static com.sofkau.tasks.RellenarFormularioDatos.rellenarFormularioDatos;
import static com.sofkau.tasks.SeleccionarFechaEntrega.seleccionarFechaEntrega;
import static com.sofkau.tasks.SeleccionarMetodoPago.seleccionarMetodoPago;
import static com.sofkau.tasks.SeleccionarProducto.seleccionarProducto;
import static com.sofkau.tasks.SetDireccion.setDireccion;
import static com.sofkau.util.SetVeriables.getUserPasword;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RealizarCompraStepDefinition extends Configuracion {
    public static Logger LOGGER= Logger.getLogger(RealizarCompraStepDefinition.class);

    private List<String> credenciales = getUserPasword();

    public RealizarCompraStepDefinition() throws IOException {
    }

    @Dado("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        try{
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()
        );
        LOGGER.info("Automatizacion Iniciada");
        }catch (Exception e){
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @Cuando("completa los campos e inicie sesion")
    public void completaLosCamposEInicieSesion() {
        try {
            theActorInTheSpotlight().wasAbleTo(
                    iniciarSesion().conElUsuario(credenciales.get(0))
                            .yConLaContrasenna(credenciales.get(1))
            );
            LOGGER.info("Sesion iniciada");
        } catch (Exception e){
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @Cuando("escoja el producto seleccionado y realize el pago")
    public void escojaElProductoSeleccionadoYRealizeElPago() {
        try {
            theActorInTheSpotlight().wasAbleTo(
                    setDireccion(),
                    refrescarPagina(),
                    buscarProducto(),
                    ordenarBusqueda(),
                    seleccionarProducto(),
                    navegarAlPago(),
                    refrescarPagina(),
                    rellenarFormularioDatos(),
                    seleccionarFechaEntrega(),
                    seleccionarMetodoPago(),
                    pagar()
            );
            LOGGER.info("Producto seleccionado y comprado");
        } catch (Exception e){
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @Entonces("el usuario vera un mensaje de de compra exitosa")
    public void elUsuarioVeraUnMensajeDeDeCompraExitosa() {
        try{
        theActorInTheSpotlight().should(
                seeThat(mensajeFinal(), equalTo("Detalles de tu compra"))
        );
        LOGGER.info("Asercion exitosa");
        } catch (Exception e){
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
}
