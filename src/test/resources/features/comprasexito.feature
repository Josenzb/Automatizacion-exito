#language:es
#encoding:UTF-8
#Author: Jose Miguel Nunez bernal

Característica: Compras en pagina del exito
  yo como usuario de la pagina exito.com
  quiero iniciar sesion en la pagina del exito
  para poder comprar productos en la página

  @Compra
  Escenario: Comprar Salchichon
    Dado que el usuario esta en la pagina de inicio
    Cuando completa los campos e inicie sesion
    Y escoja el producto seleccionado y realize el pago
    Entonces el usuario vera un mensaje de de compra exitosa

