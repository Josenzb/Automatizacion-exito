#language:es
#encoding:UTF-8
#Author: Jose Miguel Nunez bernal

Característica: Compras en pagina del exito
  yo como usuario de la pagina exito.com
  quiero iniciar sesion en la pagina del exito
  para poder comprar productos en la página

  @InicioSesión
  Escenario: Iniciar sesion
    Dado que el usuario esta en la pagina de inicio
    Cuando completa los campos para iniciar sesion
    Entonces el usuario iniciara sesion y vera un mensaje de bienvenida

