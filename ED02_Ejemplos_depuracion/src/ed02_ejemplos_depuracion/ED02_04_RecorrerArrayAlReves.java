package ed02_ejemplos_depuracion;

/**
 * ED02_04_RecorrerArrayAlReves
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
 *    Ejecútalo y lee el error de la consola. ¿Qué tipo de error es?
 *    ¿En qué línea se produce? (puedes hacer clic en el enlace azul).
 *
 * 3. HIPÓTESIS
 *    ¿Qué posición intenta leer el programa? ¿Existe esa posición?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en la línea 44 (System.out.println...).
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿Cuánto vale "i" la primera vez que se para? ¿Y numeros.length?
 *    ¿Cuál es la última posición válida del array?
 *
 * 6. CORRECCIÓN
 *    ¿Con qué valor debe empezar "i"?
 *
 * @author jm
 */
public class ED02_04_RecorrerArrayAlReves {

    public static void main(String[] args) {

        int[] numeros = {3, -5, 0, 87, 0};

        for (int i = numeros.length; i >= 0; i--) {
            System.out.println(i + ": " + numeros[i]);
        }
    }
}
