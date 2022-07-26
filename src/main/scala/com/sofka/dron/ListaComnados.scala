package com.sofka.dron

trait ListaComnados {
  type Comandos

  def calcularPosicion(list: List[String]): List[Int]

  def obtenerPosicionFinal(list: List[Int])

  def determinarResultado(list: List[Int]): List[Int]
}
