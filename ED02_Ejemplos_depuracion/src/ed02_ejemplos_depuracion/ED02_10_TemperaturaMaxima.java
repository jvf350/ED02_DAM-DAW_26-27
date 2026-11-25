package ed02_ejemplos_depuracion;

/**
 * ED02_10_TemperaturaMaxima  ·  SOLUCIÓN
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
 *    Muestra 0, que no es ninguna de las temperaturas.
 *
 * 3. HIPÓTESIS
 *    El 0 es el valor inicial de "maxima", que nunca se cambia.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En el if de dentro del bucle, con los watches.
 *
 * 5. ¿QUÉ OBSERVO?
 *    temperaturas[i] > maxima es false en todas las vueltas: ninguna
 *    temperatura negativa es mayor que 0. Con temperaturas positivas sí
 *    funcionaría, por eso es importante probar varios casos.
 *
 * 6. CORRECCIÓN
 *    Empezar con el primer elemento del array:
 *    int maxima = temperaturas[0];
 *
 * @author jm
 */
public class ED02_10_TemperaturaMaxima {

    public static void main(String[] args) {

        int[] temperaturas = {-3, -7, -1, -5};
        int maxima = temperaturas[0];

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > maxima) {
                maxima = temperaturas[i];
            }
        }

        System.out.println("La temperatura máxima fue: " + maxima);
    }
}
