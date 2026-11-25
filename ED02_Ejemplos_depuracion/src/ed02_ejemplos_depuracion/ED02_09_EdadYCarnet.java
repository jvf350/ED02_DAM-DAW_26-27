package ed02_ejemplos_depuracion;

import java.util.Scanner;

/**
 * ED02_09_EdadYCarnet  ·  SOLUCIÓN
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
 *    S y 20 -> mayor con carnet (bien)
 *    N y 20 -> mayor con carnet (mal)
 *    N y 16 -> mayor sin carnet (mal)
 *    S y 16 -> mayor con carnet (mal)
 *
 * 3. HIPÓTESIS
 *    Basta con que se cumpla UNA de las dos partes para entrar en el if.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En el primer if, con N y 20.
 *
 * 5. ¿QUÉ OBSERVO?
 *    edad >= 18 -> true;  carnet == 'S' -> false;  con || -> true.
 *    "||" (o) es cierto si se cumple alguna parte; "&&" (y) solo si se
 *    cumplen las dos. Aquí hay que comprobar las dos cosas a la vez.
 *
 * 6. CORRECCIÓN
 *    Cambiar || por && en las tres condiciones.
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

        if (edad >= 18 && carnet == 'S') {
            System.out.println("Eres mayor de edad y tienes carnet");
        } else if (edad >= 18 && carnet == 'N') {
            System.out.println("Eres mayor de edad y no tienes carnet");
        } else if (edad < 18 && carnet == 'S') {
            System.out.println("Eres menor de edad y tienes carnet");
        } else {
            System.out.println("Eres menor de edad y no tienes carnet");
        }

        teclado.close();
    }
}
