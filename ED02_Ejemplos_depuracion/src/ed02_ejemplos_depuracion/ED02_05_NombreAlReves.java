package ed02_ejemplos_depuracion;

import java.util.Scanner;

/**
 * ED02_05_NombreAlReves  ·  SOLUCIÓN
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Seguir un bucle que recorre un String carácter a carácter.
 *    Este programa tiene DOS errores.
 *    Nota: el nombre se escribe en la pestaña Console del panel de depuración.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Pedir tu nombre, saludarte y mostrarlo al revés.
 *    Por ejemplo, con "Ana" debería mostrar "anA".
 *
 * 2. ¿QUÉ HACE?
 *    Con "Ana" muestra "Ana" (no al revés) y después lanza
 *    StringIndexOutOfBoundsException: "Index 3 out of bounds for length 3".
 *
 * 3. HIPÓTESIS
 *    El bucle va del principio al final, y además se pasa de largo.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En System.out.print(nombre.charAt(i)); dentro del for.
 *
 * 5. ¿QUÉ OBSERVO?
 *    "i" toma los valores 0, 1, 2 y 3. nombre.length() vale 3, así que
 *    las posiciones válidas son 0, 1 y 2: con i = 3 salta el error
 *    (por el "<="). Además, al ir de 0 hacia arriba lo muestra en orden.
 *
 * 6. CORRECCIÓN
 *    Recorrerlo desde la última posición hasta la 0, restando:
 *    for (int i = nombre.length() - 1; i >= 0; i--)
 *
 * @author jm
 */
public class ED02_05_NombreAlReves {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Hola, " + nombre + "!");

        System.out.print("Tu nombre al revés es: ");
        for (int i = nombre.length() - 1; i >= 0; i--) {
            System.out.print(nombre.charAt(i));
        }
        System.out.println();

        teclado.close();
    }
}
