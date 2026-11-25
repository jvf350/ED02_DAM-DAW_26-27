package ed02_ejemplos_depuracion;

import java.util.Scanner;

/**
 * ED02_05_NombreAlReves
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
 *    Ejecútalo con tu nombre y anota lo que muestra y el error que aparece.
 *
 * 3. HIPÓTESIS
 *    ¿En qué orden recorre el bucle el nombre? ¿Hasta qué posición llega?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en la línea 48 (System.out.print(nombre.charAt(i));).
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿Qué valores toma "i" en cada vuelta? ¿Cuánto vale nombre.length()?
 *    ¿Qué valor tiene "i" justo cuando salta el error?
 *
 * 6. CORRECCIÓN
 *    ¿Desde dónde y hasta dónde debe ir "i"? ¿Debe aumentar o disminuir?
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
        for (int i = 0; i <= nombre.length(); i++) {
            System.out.print(nombre.charAt(i));
        }
        System.out.println();

        teclado.close();
    }
}
