package com.sofka.dron

object Dron extends ListaComnados {
  override type Comandos = String

  override def calcularPosicion(list: List[Comandos]): List[Int] = {

    val totalArriba = list.count(_ == "Arriba") * 5
    val totalAbajo = list.count(_ == "Abajo") * -5
    val totalIzquierda = list.count(_ == "Izquierda") * -5
    val totalDerecha = list.count(_ == "Derecha") * 5
    val totalAtras = list.count(_ == "Atras") * -5
    val totalAdelante = list.count(_ == "Adelante") * 5

    val posicionFinal = List(totalArriba, totalAbajo, totalIzquierda, totalDerecha, totalAtras, totalAdelante)

    determinarResultado(posicionFinal)
  }


  override def determinarResultado(list: List[Int]): List[Int] = {
    val totalArriba = list(0)
    val totalAbajo = list(1)

    val resultado = (totalArriba, totalAbajo) match {
      case (totalArriba, totalAbajo) if totalArriba <= 100 && totalAbajo >= -50 => println(
        """
          |Los resultados Finales para las siguiente coordendas son:
          |Arriba, Abajo, Izquierda, Derecha, Atrás, Adelante (Respectivamente)
          |""".stripMargin)
        list

      case (totalArriba, totalAbajo) if totalArriba > 100 || totalAbajo < -50 => println(
        s"""La coordenada arriba o abajo superan el límite
           |Máxima coordenada arriba: 100
           |Máxima coodernada abajo: -50

           |Coordenadas Encontradas
           |Arriba: $totalArriba
           |Abajo: $totalAbajo
           |
           |Se presenta la coordenada inicial por defecto
           |""".stripMargin)
        List(0, 0, 0, 0, 0, 0)
    }
    resultado
  }

  override def obtenerPosicionFinal(list: List[Int]): Unit = {
    list.foreach(posicion => println(s"Posicion: $posicion"))
  }
}