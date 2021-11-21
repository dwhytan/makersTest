# language:es
  @Todo
Característica: Prueba técnica – Automatización

    @Calculos
  Esquema del escenario: Primer escenario - Calculos y cruce informacion
    Dado que Davis insertará los siguientes registros, con parámetros: "<fecha>", "<portafolio>", "<nominal>", "<precio>", "<total>"
    Entonces él calculará el valor total
    Y validará que el valor total calculado sea igual al campo total de la base de datos
    Ejemplos:
      | fecha      | portafolio | nominal | precio | total     |
      | 15/05/2020 | OBL-MODER  | 123000  | 23.65  | 2908950   |
      | 15/05/2020 | OBL-MODER  | 10000   | 25.00  | 250000    |
      | 15/05/2020 | OBL-RIESGO | 1276987 | -10.20 | -13023267 |
      | 15/05/2020 | OBL-RIESGO | 123000  | 1.29   | 160670    |

    @Selenium
  Escenario: Segundo escenario - Manejo de selenium
    Dado que Davis ingresa a Makers
    Cuando él hace clic en CONTACTO
    Entonces Davis debe capturar el número de celular de servicio al cliente
    Y él llenará el formulario "dejanos un mensaje", y en el campo mensaje adjuntará el numero de celular capturado
    Y antes de hacer clic en el boton "enviar mensaje", Davis toma un pantallazo con la informacion diligenciada