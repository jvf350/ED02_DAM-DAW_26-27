package ed02_ejemplos_depuracion;

/**
 * ED02_13_Factorial
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Entrar en un método (Step Into, F7), salir de él (Step Out, Shift+F8)
 *    y ver la pila de llamadas en el panel Frames.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Calcular el factorial de 5: 5! = 1 x 2 x 3 x 4 x 5 = 120.
 *
 * 2. ¿QUÉ HACE?
 *    Ejecútalo y anota el resultado.
 *
 * 3. HIPÓTESIS
 *    ¿En qué vuelta del bucle crees que se estropea el cálculo?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en la línea donde se llama a calcularFactorial(...)
 *    dentro del main. Cuando se pare, pulsa F7 para entrar en el método
 *    (con F8 lo ejecutarías entero sin entrar). Mira el panel Frames.
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿Qué métodos aparecen en Frames? ¿Qué valor tiene "n"?
 *    ¿Cuánto vale "factorial" después de la primera vuelta?
 *
 * 6. CORRECCIÓN
 *    ¿Desde qué valor debe empezar "i"?
 *
 * @author jm
 */
public class ED02_13_Factorial {

    public static void main(String[] args) {

        int numero = 5;
        int resultado = calcularFactorial(numero);
        System.out.println(numero + "! = " + resultado);
    }

    public static int calcularFactorial(int n) {

        int factorial = 1;

        for (int i = 0; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
