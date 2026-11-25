package ed02_ejemplos_depuracion;

/**
 * ED02_15_DivisionEntera
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
 *    Ejecútalo y anota el error. ¿Llega a mostrar "DESPUÉS DE LA DIVISIÓN"?
 *
 * 3. HIPÓTESIS
 *    ¿Qué pasa al dividir un entero entre 0?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: esta vez no lo pongas en una línea. Abre Run > View Breakpoints
 *    (Ctrl+Shift+F8), pulsa "+" > Java Exception Breakpoints y elige
 *    ArithmeticException. Lanza el depurador (Shift+F9).
 *    Segunda parte: pon un punto de interrupción normal en la línea de la
 *    división y cambia "denominador" a 4 (F2) antes de ejecutarla.
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿En qué línea se para? ¿Qué valen numerador y denominador?
 *    Con denominador 4, ¿cuánto vale "division"? ¿Es 2.5?
 *
 * 6. CORRECCIÓN
 *    ¿Cómo evitas dividir entre 0? ¿Cómo consigues que 10 / 4 dé 2.5?
 *
 * @author jm
 */
public class ED02_15_DivisionEntera {

    public static void main(String[] args) {

        int numerador = 10;
        int denominador = 0;
        double division;

        System.out.println("ANTES DE LA DIVISIÓN");

        division = numerador / denominador;
        System.out.println("Resultado: " + division);

        System.out.println("DESPUÉS DE LA DIVISIÓN");
    }
}
