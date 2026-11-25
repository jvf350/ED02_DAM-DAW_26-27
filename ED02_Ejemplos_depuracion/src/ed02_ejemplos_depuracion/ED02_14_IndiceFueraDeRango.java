package ed02_ejemplos_depuracion;

/**
 * ED02_14_IndiceFueraDeRango  ·  SOLUCIÓN
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Leer la traza de un error (stack trace) para saber qué ha fallado
 *    y en qué línea, antes incluso de usar el depurador.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Mostrar el último módulo guardado en el array: "Entornos de Desarrollo".
 *
 * 2. ¿QUÉ HACE?
 *    Lanza ArrayIndexOutOfBoundsException: "Index 2 out of bounds for
 *    length 2", en la línea de String ultimo = modulos[2];
 *
 * 3. HIPÓTESIS
 *    Un array de tamaño 2 tiene las posiciones 0 y 1; la 2 no existe.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En la línea indicada por el error.
 *
 * 5. ¿QUÉ OBSERVO?
 *    En el panel Variables "modulos" solo tiene [0] y [1].
 *    modulos.length vale 2.
 *
 * 6. CORRECCIÓN
 *    El último elemento está en length - 1:
 *    String ultimo = modulos[modulos.length - 1];
 *
 * @author jm
 */
public class ED02_14_IndiceFueraDeRango {

    public static void main(String[] args) {

        String[] modulos = new String[2];
        modulos[0] = "Desarrollo de Aplicaciones Web";
        modulos[1] = "Entornos de Desarrollo";

        String ultimo = modulos[modulos.length - 1];
        System.out.println("El último módulo es: " + ultimo);
    }
}
