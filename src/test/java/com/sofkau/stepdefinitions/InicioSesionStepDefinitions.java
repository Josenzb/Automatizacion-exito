package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

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

    @Cuando("completa los campos e inicie sesion")
    public void completaLosCamposEInicieSesion() {
        theActorInTheSpotlight().wasAbleTo(
                iniciarSesion().conElUsuario(credenciales.get(0))
                        .yConLaContrasenna(credenciales.get(1))
        );
    }

    @Cuando("escoja el producto seleccionado y realize el pago")
    public void escojaElProductoSeleccionadoYRealizeElPago() throws InterruptedException {
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
        Thread.sleep(10000);
    }
    @Entonces("el usuario vera un mensaje de de compra exitosa")
    public void elUsuarioVeraUnMensajeDeDeCompraExitosa() {
        theActorInTheSpotlight().should(
                seeThat(mensajeFinal(), equalTo("Detalles de tu compra"))
        );
    }
}
