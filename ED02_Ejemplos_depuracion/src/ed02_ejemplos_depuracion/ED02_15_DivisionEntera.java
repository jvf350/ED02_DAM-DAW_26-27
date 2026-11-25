package ed02_ejemplos_depuracion;

/**
 * ED02_15_DivisionEntera  ·  SOLUCIÓN
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Puntos de interrupción de excepción: el depurador se para justo
 *    cuando se produce un error, aunque no sepas en qué línea será.
 *    Este programa tiene DOS errores; el segundo no da ningún aviso.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Dividir numerador entre denominador y mostrar el resultado con
 *    decimales. Si el denominador es 0, avisar en lugar de dividir.
 *
 * 2. ¿QUÉ HACE?
 *    Muestra "ANTES DE LA DIVISIÓN" y lanza ArithmeticException: / by zero.
 *    El programa se detiene y no llega a "DESPUÉS DE LA DIVISIÓN".
 *
 * 3. HIPÓTESIS
 *    Con números enteros no se puede dividir entre 0.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Un punto de interrupción de excepción para ArithmeticException.
 *
 * 5. ¿QUÉ OBSERVO?
 *    Se para en la línea de la división: numerador = 10, denominador = 0.
 *    Con denominador = 4, "division" vale 2.0 y no 2.5: al dividir dos int
 *    se pierden los decimales ANTES de guardarlo en el double.
 *
 * 6. CORRECCIÓN
 *    Comprobar el denominador antes de dividir, y convertir uno de los dos
 *    números a double para conservar los decimales:
 *    if (denominador != 0) { division = (double) numerador / denominador; ... }
 *
 * @author jm
 */
public class ED02_15_DivisionEntera {

    public static void main(String[] args) {

        int numerador = 10;
        int denominador = 0;
        double division;

        System.out.println("ANTES DE LA DIVISIÓN");

        if (denominador != 0) {
            division = (double) numerador / denominador;
            System.out.println("Resultado: " + division);
        } else {
            System.out.println("No se puede dividir entre 0");
        }

        System.out.println("DESPUÉS DE LA DIVISIÓN");
    }
}
