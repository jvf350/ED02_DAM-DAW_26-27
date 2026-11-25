package ed02_ejemplos_depuracion;

/**
 * ED02_02_MediaNotas
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Seguir el valor de una variable dentro de un bucle con F8
 *    y en el panel Variables.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Calcular la nota media de 7, 4, 8 y 6. El resultado correcto es 6.25.
 *
 * 2. ¿QUÉ HACE?
 *    Ejecútalo y anota lo que muestra.
 *
 * 3. HIPÓTESIS
 *    ¿Qué crees que falla: la suma, la división o las dos?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en la línea 41 (suma = notas[i];) y avanza con F8.
 *    Cuando termine el bucle, pon otro en la línea 43 (media = ...).
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿Qué valor tiene "suma" en cada vuelta? ¿Y al salir del bucle?
 *    ¿Qué valor toma "media" después de la línea 43?
 *
 * 6. CORRECCIÓN
 *    ¿Qué cambias en cada una de las dos líneas?
 *
 * @author jm
 */
public class ED02_02_MediaNotas {

    public static void main(String[] args) {

        int[] notas = {7, 4, 8, 6};
        int suma = 0;
        double media;

        for (int i = 0; i < notas.length; i++) {
            suma = notas[i];
        }
        media = suma / notas.length;

        System.out.println("La media es: " + media);
    }
}
