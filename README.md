Fecha: 2020-12-26

## Practica Calculadora 

Mi primer proyecto de android

Este proyecto es con el que he ido aprendiendo a programar en Android.

    - Lenguaje: java
    - Entorno: Android Studio

Se trata de una calculadora que permite introducir una expresión aritmética y evaluarla para devolver el resultado final en la misma pantalla.

3º iteración <en proceso>:  Objetivos:
    * Permitir decimales[done]
    * Añadir botón de "eliminar", "%"[done]
    * Restablecer tras pulsar el botón "="[changed] >> añadido botón "C"
    * Habilitar el botón "+/-" permitiendo introducir números negativos directamente [doing]
        

## Historial

1º iteración 2020-12-11: se aplican los conceptos más básicos de una aplicación android: Activity, Views, Layouts y Resources. 
    * Se introducen dos dígitos en dos EditText diferentes y luego se selecciona la operación a realizar
 
2º iteración 2020-12-22: actualización de la interfaz utilizando TableLayout y TableRow. Modificación de la parte lógica permitiendo operaciones más complejas respetando la prioridad de operaciones
    * Se van introduciendo dígitos y operaciones y al pulsar "=" se evalúa por enetero la expresión

3º iteración 2020-12-26: actualización de la interfaz añadiendo formato a los botones y más funcionalidades. Ahora se admiten operaciones con decimales (Double) y las operaciones % (devuelve el resto de una división), . (para construir decimales), y C ("clear", restablece la expresión)
