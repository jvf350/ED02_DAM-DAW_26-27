package ed02_ejemplos_depuracion;

/**
 * ED02_18_ContarBEntreA  ·  SOLUCIÓN
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
 *    Muestra 0 para todos los textos.
 *
 * 3. HIPÓTESIS
 *    "i" recorre los textos y "j" las letras, pero se compara con charAt(i).
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En el primer if del bucle interior, con los watches.
 *
 * 5. ¿QUÉ OBSERVO?
 *    linea.charAt(i) siempre compara la misma letra durante todo el texto
 *    (la posición del texto, no la de la letra). Tras cambiarlo a
 *    charAt(j), "bbba" da 3 en vez de 0: "hayA" empieza en true, así que
 *    cuenta las "b" del principio aunque aún no haya aparecido ninguna "a".
 *
 * 6. CORRECCIÓN
 *    if (linea.charAt(j) == 'a')   y   hayA = false;  al empezar cada texto.
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
            hayA = false;
            contador = 0;
            total = 0;

            for (int j = 0; j < linea.length(); j++) {
                if (linea.charAt(j) == 'a') {
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
