package com.sofka.dron

object Dron extends ListaComnados {
  override type Comandos = String

  override def calcularPosicion(list: List[Comandos]): List[Int] = {
    var totalArriba = 0
    var totalAbajo = 0
    var totalIzquierda = 0
    var totalDerecha = 0
    var totalAtras = 0
    var totalAdelante = 0

    list.foreach {
      case "Arriba" => totalArriba += 5
      case "Abajo" => totalAbajo -= 5
      case "Izquierda" => totalIzquierda -= 5
      case "Derecha" => totalDerecha += 5
      case "Atras" => totalAtras -= 5
      case "Adelante" => totalAdelante += 5
    }

    val posicionFinal = List(totalArriba, totalAbajo, totalIzquierda, totalDerecha, totalAtras, totalAdelante)

    determinarResultado(posicionFinal)
  }


  override def determinarResultado(list: List[Int]): List[Int] = {
    val totalArriba = list(0)
    val totalAbajo = list(1)

    if (totalArriba <= 100 && totalAbajo >= -50) {
      println(
        """
          |Los resultados Finales para las siguiente coordendas son:
          |Arriba, Abajo, Izquierda, Derecha, Atrás, Adelante (Respectivamente)
          |""".stripMargin)
      list
    } else {
      println(
        """La coordenada arriba o abajo superan el límite
          |Máxima coordenada arriba: 100
          |Máxima coodernada abajo: -50
          |Se presenta la coordenada inicial por defecto
          |""".stripMargin)
      List(0, 0, 0, 0, 0, 0)
    }
  }

  override def obtenerPosicionFinal(list: List[Int]): Unit = {
    list.foreach(posicion => println(s"Posicion: $posicion"))
  }
}