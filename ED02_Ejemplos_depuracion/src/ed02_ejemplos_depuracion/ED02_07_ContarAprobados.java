package ed02_ejemplos_depuracion;

/**
 * ED02_07_ContarAprobados
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
 *    Ejecútalo y anota el resultado.
 *
 * 3. HIPÓTESIS
 *    ¿Qué notas crees que no está contando?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo dentro del bucle, en la línea del if, y avanza con F8.
 *
 * 5. ¿QUÉ OBSERVO?
 *    Cuando "nota" vale 5.0, ¿entra en el if? ¿Por qué?
 *    Prueba a cambiar con F2 el valor de "nota" a 4.99 y a 5.01.
 *
 * 6. CORRECCIÓN
 *    ¿Qué operador de comparación debe usarse?
 *
 * @author jm
 */
public class ED02_07_ContarAprobados {

    public static void main(String[] args) {

        double[] notas = {4.5, 5.0, 7.25, 3.0, 5.0, 9.0};
        int aprobados = 0;

        for (double nota : notas) {
            if (nota > 5) {
                aprobados++;
            }
        }

        System.out.println("Aprobados: " + aprobados + " de " + notas.length);
    }
}
