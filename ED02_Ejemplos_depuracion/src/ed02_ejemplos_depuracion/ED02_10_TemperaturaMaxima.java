package ed02_ejemplos_depuracion;

/**
 * ED02_10_TemperaturaMaxima
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Usar Watches: expresiones que se vigilan en todo momento.
 *    En el panel Variables pulsa "+" (New Watch) y añade:
 *       maxima
 *       temperaturas[i]
 *       temperaturas[i] > maxima
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Mostrar la temperatura más alta de las mañanas de invierno: -1.
 *
 * 2. ¿QUÉ HACE?
 *    Ejecútalo. ¿El resultado está entre las temperaturas del array?
 *
 * 3. HIPÓTESIS
 *    ¿De dónde sale ese valor?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en el if de dentro del bucle y añade los watches.
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿Entra alguna vez en el if? ¿Por qué?
 *    ¿Funcionaría con temperaturas positivas? Pruébalo cambiando valores.
 *
 * 6. CORRECCIÓN
 *    ¿Con qué valor debe empezar "maxima" para que funcione siempre?
 *
 * @author jm
 */
public class ED02_10_TemperaturaMaxima {

    public static void main(String[] args) {

        int[] temperaturas = {-3, -7, -1, -5};
        int maxima = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > maxima) {
                maxima = temperaturas[i];
            }
        }

        System.out.println("La temperatura máxima fue: " + maxima);
    }
}
