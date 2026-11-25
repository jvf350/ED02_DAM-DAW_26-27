package ed02_ejemplos_depuracion;

/**
 * ED02_07_ContarAprobados  ·  SOLUCIÓN
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Comprobar los casos límite: qué pasa justo en la frontera de una
 *    condición. También puedes cambiar valores (F2) para probar.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Contar cuántas notas son aprobado (un 5 o más).
 *    Con las notas del programa hay 4 aprobados de 6.
 *
 * 2. ¿QUÉ HACE?
 *    Muestra "Aprobados: 2 de 6".
 *
 * 3. HIPÓTESIS
 *    No cuenta los 5.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En el if de dentro del bucle.
 *
 * 5. ¿QUÉ OBSERVO?
 *    Con nota = 5.0 la condición nota > 5 es false: no entra en el if.
 *    Con 4.99 no entra (correcto) y con 5.01 sí (correcto). El fallo está
 *    justo en la frontera.
 *
 * 6. CORRECCIÓN
 *    Usar >= en lugar de >:  if (nota >= 5)
 *
 * @author jm
 */
public class ED02_07_ContarAprobados {

    public static void main(String[] args) {

        double[] notas = {4.5, 5.0, 7.25, 3.0, 5.0, 9.0};
        int aprobados = 0;

        for (double nota : notas) {
            if (nota >= 5) {
                aprobados++;
            }
        }

        System.out.println("Aprobados: " + aprobados + " de " + notas.length);
    }
}
