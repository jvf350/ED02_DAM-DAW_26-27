package ed02_ejemplos_depuracion;

import java.util.Scanner;

/**
 * ED02_09_EdadYCarnet
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Evaluar condiciones compuestas (Alt+F8) con datos leídos de teclado.
 *    Nota: los datos se escriben en la pestaña Console del panel de depuración.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Preguntar si tienes carnet de conducir (S/N) y tu edad,
 *    y mostrar uno de estos cuatro mensajes:
 *       mayor de edad con carnet, mayor de edad sin carnet,
 *       menor de edad con carnet, menor de edad sin carnet.
 *
 * 2. ¿QUÉ HACE?
 *    Pruébalo con estos datos y anota los resultados:
 *       S y 20     N y 20     N y 16     S y 16
 *
 * 3. HIPÓTESIS
 *    ¿Qué condición crees que se cumple cuando no debería?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en el primer if. Introduce N y 20, y cuando se pare
 *    evalúa con Alt+F8:
 *       edad >= 18
 *       carnet == 'S'
 *       edad >= 18 || carnet == 'S'
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿Qué significa "||"? ¿Y "&&"? ¿Cuál necesitas aquí?
 *
 * 6. CORRECCIÓN
 *    ¿Qué cambias en las condiciones?
 *
 * @author jm
 */
public class ED02_09_EdadYCarnet {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Tienes carnet de conducir? (S/N): ");
        char carnet = teclado.next().charAt(0);

        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        if (edad >= 18 || carnet == 'S') {
            System.out.println("Eres mayor de edad y tienes carnet");
        } else if (edad >= 18 || carnet == 'N') {
            System.out.println("Eres mayor de edad y no tienes carnet");
        } else if (edad < 18 || carnet == 'S') {
            System.out.println("Eres menor de edad y tienes carnet");
        } else {
            System.out.println("Eres menor de edad y no tienes carnet");
        }

        teclado.close();
    }
}
