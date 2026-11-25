# ED02 · Depuración de código en Java
Programas Java sencillos **con errores** para aprender a depurar código
con el depurador de IntelliJ IDEA.

El proyecto está en la carpeta `ED02_Ejemplos_depuracion`. Ábrelo en
IntelliJ con *File → Open* y, si te lo pide, elige un JDK en
*File → Project Structure → Project → SDK*.

## Cómo trabajar cada ejemplo

Cada programa empieza con un comentario que sigue estos seis pasos.
El primero ya está contestado; trata de razonar el resto de cuestiones antes de mirar las posibles soluciones.

1. **¿Qué debería hacer?** Lo que se espera del programa.
2. **¿Qué hace?** Ejecútalo y anota lo que ocurre de verdad.
3. **Hipótesis.** ¿Por qué crees que falla?
4. **Punto/s de interrupción.** ¿Dónde se colocan? Cada ejemplo trae una pista.
5. **¿Qué observo?** Valores de las variables, expresiones evaluadas…
6. **Corrección.** ¿Qué cambias para que funcione?

Consejo: antes de abrir el depurador, ten claro qué debería salir.
Sin eso no sabrás qué estás buscando.

## Ejemplos

Hazlos en orden: cada uno introduce algo nuevo del depurador.

| Nombre de la clase | Qué se practica con el depurador |
|---|---|
| `ED02_01_PrimerosPasos` | Punto de interrupción, F8, panel Variables y cambiar un valor (sin errores) |
| `ED02_02_MediaNotas` | Seguir una variable dentro de un bucle |
| `ED02_03_TablaMultiplicar` | Detectar un bucle infinito (y la importancia de los nombres) |
| `ED02_04_RecorrerArrayAlReves` | Valor inicial de un bucle y tamaño de un array |
| `ED02_05_NombreAlReves` | Recorrer un String carácter a carácter |
| `ED02_06_LongitudTexto` | Cambiar valores (F2) para probar casos límite |
| `ED02_07_ContarAprobados` | Casos límite en una comparación |
| `ED02_08_Multiplos` | Evaluar expresiones por partes (Alt+F8) |
| `ED02_09_EdadYCarnet` | Evaluar condiciones compuestas con datos de teclado |
| `ED02_10_TemperaturaMaxima` | Watches |
| `ED02_11_CompararTextos` | Evaluar expresiones: comparar String |
| `ED02_12_PotenciasDeDos` | Puntos de interrupción condicionales |
| `ED02_13_Factorial` | Entrar en un método (F7) y panel Frames |
| `ED02_14_IndiceFueraDeRango` | Leer la traza de un error |
| `ED02_15_DivisionEntera` | Puntos de interrupción de excepción |
| `ED02_16_DivisionReal` | Errores que no lanzan excepción |
| `ED02_17_NombreCancelar` | NullPointerException (usa ventanas: solo IntelliJ) |
| `ED02_18_ContarBEntreA` | Reto final |

## Atajos de IntelliJ (Windows / Linux)

| Acción | Atajo |
|---|---|
| Ejecutar | `Shift+F10` |
| Depurar | `Shift+F9` |
| Poner / quitar punto de interrupción | clic en el margen o `Ctrl+F8` |
| Step Over (siguiente línea) | `F8` |
| Step Into (entrar en el método) | `F7` |
| Step Out (salir del método) | `Shift+F8` |
| Continuar hasta el siguiente punto | `F9` |
| Ejecutar hasta el cursor | `Alt+F9` |
| Evaluar expresión | `Alt+F8` |
| Cambiar valor de una variable | `F2` en el panel Variables |
| Ver todos los puntos de interrupción | `Ctrl+Shift+F8` |
| Parar | `Ctrl+F2` |

## Programas que leen de teclado

`ED02_05_NombreAlReves`, `ED02_09_EdadYCarnet` y `ED02_11_CompararTextos`
piden datos. Mientras depuras, escríbelos en la pestaña **Console** del panel
de depuración y pulsa Intro.
