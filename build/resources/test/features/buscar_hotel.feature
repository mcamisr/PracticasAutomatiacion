#language:es
@buscarhotel
Característica: Buscar hotel
  Yo  como un usuario
  Quiero buscar un hotel
  Para  trabajar ver su precio


  @tag1
  Escenario: : Buscar Hotel
    Dado que navego por la pagina
    Cuando  Busco ingreso un nombre de hotel
      | hotel                      |
      |Huntington Beach            |
    Entonces  deberia ver el precio e informacion del hotel

  @tag2
Escenario: : Buscar Hotel mas carro
  Dado que navego por la pagina
  Cuando  Busco ingreso un nombre de hotel y selecciono carro
    | hotel                      |
    |miami                       |
  Entonces  deberia ver el precio e informacion del hotel y carro


