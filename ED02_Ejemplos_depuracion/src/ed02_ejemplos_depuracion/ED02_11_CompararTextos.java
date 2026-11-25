package ed02_ejemplos_depuracion;

import java.util.Scanner;

/**
 * ED02_11_CompararTextos
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Evaluar expresiones (Alt+F8) para descubrir que dos textos
 *    que parecen iguales no son "==" en Java.
 *    Nota: la respuesta se escribe en la pestaña Console del panel de depuración.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Saludar y preguntar si quieres otro saludo. Mientras respondas "si",
 *    debe volver a saludar. Con "no" termina.
 *
 * 2. ¿QUÉ HACE?
 *    Ejecútalo y responde "si". ¿Qué ocurre?
 *
 * 3. HIPÓTESIS
 *    ¿Por qué no se repite el saludo?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en la línea del while. Responde "si" y, cuando se pare,
 *    mira el valor de "respuesta" en el panel Variables y evalúa (Alt+F8):
 *       respuesta == "si"
 *       respuesta.equals("si")
 *
 * 5. ¿QUÉ OBSERVO?
 *    Si "respuesta" vale "si", ¿por qué la primera expresión da false?
 *
 * 6. CORRECCIÓN
 *    ¿Cómo se comparan dos String en Java?
 *
 * @author jm
 */
public class ED02_11_CompararTextos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("¡Hola!");
            System.out.print("¿Quieres que te salude otra vez? (si/no): ");
            respuesta = teclado.nextLine();
        } while (respuesta == "si");

        System.out.println("¡Adiós!");
        teclado.close();
    }
}
