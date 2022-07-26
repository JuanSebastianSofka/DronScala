package com.sofka.dron

object DronTest {
  def main(args: Array[String]): Unit = {

    val comandos = List("Arriba", "Arriba", "Arriba", "Abajo", "Abajo", "Izquierda", "Derecha",
      "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba",
      "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba",
      "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba",
      "Abajo", "Abajo", "Abajo", "Abajo", "Abajo", "Abajo", "Abajo", "Abajo", "Abajo")

    val comandos2 = List("Arriba", "Arriba", "Arriba", "Abajo", "Abajo", "Izquierda", "Derecha",
      "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Atras", "Atras", "Atras", "Adelante")

    val posicionFinalError = Dron.calcularPosicion(comandos)
    Dron.obtenerPosicionFinal(posicionFinalError)

    val posicionFinalSinError = Dron.calcularPosicion(comandos2)
    Dron.obtenerPosicionFinal(posicionFinalSinError)
  }
}
