package ed02_ejemplos_depuracion;

import java.util.Scanner;

/**
 * ED02_11_CompararTextos  ·  SOLUCIÓN
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
 *    Aunque respondas "si", dice "¡Adiós!" y termina.
 *
 * 3. HIPÓTESIS
 *    La comparación respuesta == "si" no funciona como esperamos.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En la línea del while.
 *
 * 5. ¿QUÉ OBSERVO?
 *    "respuesta" vale "si", pero respuesta == "si" da false y
 *    respuesta.equals("si") da true. Con objetos como String, "=="
 *    compara si son el MISMO objeto en memoria, no si tienen el mismo texto.
 *
 * 6. CORRECCIÓN
 *    Comparar con equals:  while (respuesta.equals("si"))
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
        } while (respuesta.equals("si"));

        System.out.println("¡Adiós!");
        teclado.close();
    }
}
