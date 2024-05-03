# Conversor-de-Monedas
Software desarrollado en java con el objetivo de consumir una API, que nos brinde información del valor de la moneda actual, para realizar su conversión.
<h2>Funciones</h2>
EL software permite convertir monedas, como tambien realiza un historial de conversiones, las cuales se van actualizando y guardando en un json. Este software funciona desde el terminal.
Nos permite convertir:
                    1. Dolar => Peso Colombiano
                    2. Peso Colombiano => Dolar
                    3. Dolar => Peso Argentino
                    4. Peso Argentino => Dolar
                    5. Dolar => Real Brasileño
                    6. Peso Brasileño => Dolar
<h2>Manual</h2>
El presente software consume una API, EXChangeRate, la cual nos brinda la información de las diferentes monedas actuales.
El package modelo contiene la clase Historial que contiene un constructor y del cual conformamos los diferentes objetos almacenados en el json, como historial.
El package Operaciones, contiene las diferentes herramientas y clases que conforman la funcioinalidad, entre ellas estan:
  Coneccion: que nos permite hacer una solicitud a la API.
  FiltrarDivisa: que nos permite filtrar la divisa a la cual haremos la conversión.
  Operación: La cual multiplica la divisa filtrada con el valor que deseamos convertir.
  CreadorJson: que nos permite llamar el modelo persona para pasar parametros, ingresarlos en un arrayList para de nuevo sobrescribir en el json existente.
  LectorJson: El cual nos permite leer el Json para pasarlo como historial y mostrarlo al usuario.
  Vista: Es la clase que nos brinda las impresiones por consola, para mostrar al usuario.
