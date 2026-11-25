package ed02_ejemplos_depuracion;

/**
 * ED02_04_RecorrerArrayAlReves  ·  SOLUCIÓN
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Comprobar el valor inicial de la variable de un bucle for
 *    y compararlo con el tamaño del array.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Mostrar el array del último elemento al primero, con su posición:
 *    4: 0
 *    3: 87
 *    2: 0
 *    1: -5
 *    0: 3
 *
 * 2. ¿QUÉ HACE?
 *    No muestra nada y lanza ArrayIndexOutOfBoundsException:
 *    "Index 5 out of bounds for length 5".
 *
 * 3. HIPÓTESIS
 *    Intenta leer la posición 5, que no existe.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En el println de dentro del for.
 *
 * 5. ¿QUÉ OBSERVO?
 *    La primera vez "i" vale 5 y numeros.length también vale 5.
 *    Las posiciones van de 0 a length - 1, es decir, de 0 a 4.
 *
 * 6. CORRECCIÓN
 *    "i" debe empezar en numeros.length - 1.
 *
 * @author jm
 */
public class ED02_04_RecorrerArrayAlReves {

    public static void main(String[] args) {

        int[] numeros = {3, -5, 0, 87, 0};

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + numeros[i]);
        }
    }
}
