package ed02_ejemplos_depuracion;

/**
 * ED02_18_ContarBEntreA
 *
 * RETO FINAL: usa todo lo que has aprendido (puntos de interrupción,
 * F8, panel Variables, watches y Alt+F8). Este programa tiene DOS errores.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Para cada texto, contar las "b" que están entre dos "a".
 *    Las "b" del principio (antes de la primera "a") y las del final
 *    (después de la última "a") no cuentan. Resultados correctos:
 *       abbabbaaab -> 4
 *       aaaba      -> 1
 *       bbba       -> 0
 *       ababab     -> 2
 *
 * 2. ¿QUÉ HACE?
 *    Ejecútalo y compara con los resultados correctos.
 *
 * 3. HIPÓTESIS
 *    ¿Qué variable recorre los textos y cuál recorre las letras?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en el primer if del bucle interior. Añade watches con
 *    i, j, linea.charAt(j), hayA, contador y total.
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿Qué letra se está comparando en cada vuelta? ¿Es la que toca?
 *    Cuando corrijas el primer error, prueba con "bbba": ¿con qué valor
 *    empieza "hayA"? ¿Debería valer eso si todavía no ha aparecido una "a"?
 *
 * 6. CORRECCIÓN
 *    ¿Qué dos cosas cambias?
 *
 * @author jm
 */
public class ED02_18_ContarBEntreA {

    public static void main(String[] args) {

        String[] lineas = {"abbabbaaab", "aaaba", "bbba", "ababab"};
        boolean hayA;   // true cuando ya se ha encontrado alguna "a"
        int contador;   // "b" vistas desde la última "a"
        int total;      // "b" que sí están entre dos "a"

        for (int i = 0; i < lineas.length; i++) {
            String linea = lineas[i];
            hayA = true;
            contador = 0;
            total = 0;

            for (int j = 0; j < linea.length(); j++) {
                if (linea.charAt(i) == 'a') {
                    if (hayA && contador != 0) {
                        total = total + contador;
                        contador = 0;
                    } else {
                        hayA = true;
                    }
                } else if (hayA) {
                    contador++;
                }
            }
            System.out.println(linea + " -> " + total);
        }
    }
}
