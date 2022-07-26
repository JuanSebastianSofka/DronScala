# Ejercicio Dron

Tenemos un dron que para iniciar su ruta debemos de ingresar una serie de comandos, podemos especificarle si va hacia Arriba, Abajo, Derecha, Izquierda, Atrás, Adelante.

## Indicaciones

```bash
Cada comando Arriba suma 5 puntos.
Cada comando Abajo resta 5 puntos.
Cada comando a la Derecha suma 5 puntos.
Cada comando a la Izquierda resta 5 puntos.
Cada comando Atrás resta 5 puntos.
Cada comando hacia Delante suma 5 puntos.
```
El dron comienza en la posición (0,0,0,0,0,0), Arriba, Abajo, Izquierda, Derecha, Atrás, Adelante) respectivamente.

## Consideraciones

```python
Para probar si el ejercicio está bueno, le pasaremos una lista de comandos y al final debe 
imprimir en qué posición quedó.

El comando hacia arriba no puede superar los 100 puntos.

El comando hacia abajo no puede superar los -50 puntos.
```

## Comandos de Prueba
```python
Comando 1: "Arriba", "Arriba", "Arriba", "Abajo", "Abajo", "Izquierda", "Derecha",
      "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba",
      "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba",
      "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba",
      "Abajo", "Abajo", "Abajo", "Abajo", "Abajo", "Abajo", "Abajo", "Abajo", "Abajo"

Comando 2: "Arriba", "Arriba", "Arriba", "Abajo", "Abajo", "Izquierda", "Derecha",
      "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba",
      "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba",
      "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba"

Comando 3: "Arriba", "Arriba", "Arriba", "Abajo", "Abajo", "Izquierda", "Derecha",
      "Abajo", "Abajo", "Abajo", "Abajo", "Abajo", "Abajo", "Abajo", "Abajo", "Abajo"

Comando 4: "Arriba", "Arriba", "Arriba", "Abajo", "Abajo", "Izquierda", "Derecha",
      "Arriba", "Arriba", "Arriba", "Arriba", "Arriba", "Arriba",
      "Arriba", "Arriba", "Atras", "Atras", "Atras", "Adelante"
```

## Nota
Los primeros 3 comandos están diseñados para fallar la prueba ya que la coordenada arriba o abajo superarán el límite establecido. 

El Comando 4 por el contrario, está diseño para superar la prueba.