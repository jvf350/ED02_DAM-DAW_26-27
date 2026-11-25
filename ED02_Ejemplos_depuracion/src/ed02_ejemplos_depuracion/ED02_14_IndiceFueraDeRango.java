package ed02_ejemplos_depuracion;

/**
 * ED02_14_IndiceFueraDeRango
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Leer la traza de un error (stack trace) para saber qué ha fallado
 *    y en qué línea, antes incluso de usar el depurador.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Mostrar el último módulo guardado en el array: "Entornos de Desarrollo".
 *
 * 2. ¿QUÉ HACE?
 *    Ejecútalo y lee el error de la consola con calma:
 *    ¿qué tipo de excepción es? ¿qué índice indica? ¿y qué tamaño?
 *    Haz clic en el enlace azul: te lleva a la línea del error.
 *
 * 3. HIPÓTESIS
 *    ¿Qué posiciones tiene un array de tamaño 2?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en la línea que te ha señalado el error.
 *
 * 5. ¿QUÉ OBSERVO?
 *    Despliega "modulos" en el panel Variables: ¿qué posiciones aparecen?
 *    Evalúa (Alt+F8) modulos.length
 *
 * 6. CORRECCIÓN
 *    ¿Qué índice hay que usar? ¿Cómo lo escribirías para que funcione
 *    aunque el array cambie de tamaño?
 *
 * @author jm
 */
public class ED02_14_IndiceFueraDeRango {

    public static void main(String[] args) {

        String[] modulos = new String[2];
        modulos[0] = "Desarrollo de Aplicaciones Web";
        modulos[1] = "Entornos de Desarrollo";

        String ultimo = modulos[2];
        System.out.println("El último módulo es: " + ultimo);
    }
}
