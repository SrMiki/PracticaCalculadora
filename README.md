Fecha: 2021-01-09

## Practica Calculadora 

Proyecto de aprendizaje de Android.

    - Lenguaje: java
    - Entorno: Android Studio

Se trata de una calculadora que permite introducir una expresión aritmética y evaluarla para devolver el resultado final en la misma pantalla.     

4º iteración <to do>:  Objetivos:
    * Permitir utilizar el resultado de una operación como operador
    * Añadir un "historial" de operaciones utilizando bases de datos
    * Mejorar la interfaz añdiendo "themes" y "layouts"   

## Historial

1º iteración 2020-12-11: se aplican los conceptos más básicos de una aplicación android: Activity, Views, Layouts y Resources. 
    * Se introducen dos dígitos en dos EditText diferentes y luego se selecciona la operación a realizar
 
2º iteración 2020-12-22: actualización de la interfaz utilizando TableLayout y TableRow. Modificación de la parte lógica permitiendo operaciones más complejas respetando la prioridad de operaciones
    * Se van introduciendo dígitos y operaciones y al pulsar "=" se evalúa por enetero la expresión

3º iteración 2021-01-09: actualización de la interfaz añadiendo formato a los botones y más funcionalidades. Ahora se admiten operaciones con decimales (Double) y las operaciones "%" (devuelve el resto de una división), "."(para construir decimales), "C" ("clear", restablece la expresión) y "+/-" que pasa a negativo el resultado obtenido.


## Comentarios

- Java no tiene un "evaluador de expresiones" por lo que he desarrollado la clase "Expression" para poder resolver las operaciones. 
