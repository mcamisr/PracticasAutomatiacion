#language:es
@iniciosesion
Característica: inicio de sesion
Yo como  usuario registrado
Quiero iniciar sesion en la pagina travelocity
Para  trabajar en ella


  @tag1
  Escenario: : inicio de sesion
    Dado que ingreso a la pagina de travelocity
    Cuando  ingreso mis credenciales incorrectas
      | usuario                    | contrasena   |
      |k_a_myla16@hotmail.com      | 2g1fdg       |
    Entonces  debe aparecer un mensaje de error


