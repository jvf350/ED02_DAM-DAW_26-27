package ed02_ejemplos_depuracion;

/**
 * ED02_13_Factorial  ·  SOLUCIÓN
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Entrar en un método (Step Into, F7), salir de él (Step Out, Shift+F8)
 *    y ver la pila de llamadas en el panel Frames.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Calcular el factorial de 5: 5! = 1 x 2 x 3 x 4 x 5 = 120.
 *
 * 2. ¿QUÉ HACE?
 *    Muestra "5! = 0".
 *
 * 3. HIPÓTESIS
 *    En alguna vuelta se multiplica por 0.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En la llamada a calcularFactorial(numero) del main, entrando con F7.
 *
 * 5. ¿QUÉ OBSERVO?
 *    En Frames aparecen calcularFactorial encima de main: es la pila de
 *    llamadas. "n" vale 5. En la primera vuelta i = 0, así que
 *    factorial = 1 * 0 = 0, y a partir de ahí todo es 0.
 *
 * 6. CORRECCIÓN
 *    El bucle debe empezar en 1:  for (int i = 1; i <= n; i++)
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

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
