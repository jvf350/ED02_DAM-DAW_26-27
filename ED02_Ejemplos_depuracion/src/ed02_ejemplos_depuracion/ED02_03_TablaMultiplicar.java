package ed02_ejemplos_depuracion;

/**
 * ED02_03_TablaMultiplicar
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Seguir un bucle paso a paso y detectar un bucle infinito.
 *    Además, las variables tienen nombres MUY poco claros a propósito:
 *    fíjate en lo difícil que es seguirlas (z04l32 lleva una "ele",
 *    z04532 un "cinco" y z04132 un "uno").
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Mostrar la tabla de multiplicar del 3, desde 3 x 1 = 3 hasta 3 x 9 = 27.
 *
 * 2. ¿QUÉ HACE?
 *    Ejecútalo y anota lo que muestra. (Para pararlo: botón rojo o Ctrl+F2).
 *
 * 3. HIPÓTESIS
 *    ¿Por qué crees que no termina nunca?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en la línea 44 (dentro del do) y pulsa F8 varias veces.
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿Qué variables cambian de valor en cada vuelta y cuáles no?
 *    ¿Qué variable se usa en la condición del while?
 *
 * 6. CORRECCIÓN
 *    ¿Qué línea falta? ¿Qué nombres darías a las variables?
 *
 * @author jm
 */
public class ED02_03_TablaMultiplicar {

    public static void main(String[] args) {

        int z04l32 = 3;
        int z04532;
        int z04132 = 0;

        z04532 = 1;

        do {
            z04132 = z04532 * z04l32;
            System.out.println(z04l32 + " x " + z04532 + " = " + z04132);
        } while (z04532 < 10);
    }
}
