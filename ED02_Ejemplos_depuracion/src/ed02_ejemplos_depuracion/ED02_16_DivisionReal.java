package ed02_ejemplos_depuracion;

/**
 * ED02_16_DivisionReal
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Detectar un error que NO lanza ninguna excepción: el programa termina
 *    "bien" pero el resultado no tiene sentido. Compáralo con
 *    ED02_15_DivisionEntera. También practicas entrar en un método (F7).
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Dividir dos números reales. Si el divisor es 0, debe avisar de que
 *    no se puede dividir en lugar de mostrar un resultado.
 *
 * 2. ¿QUÉ HACE?
 *    Ejecútalo. ¿Aparece algún error en rojo? ¿Qué resultado muestra?
 *
 * 3. HIPÓTESIS
 *    ¿Por qué con int da error y con double no?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en la línea del main que llama a divisionReal(...)
 *    y entra en el método con F7.
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿Qué valores llegan a "x" e "y"? Evalúa (Alt+F8) x / y.
 *
 * 6. CORRECCIÓN
 *    ¿Dónde y cómo compruebas que el divisor no es 0?
 *
 * @author jm
 */
public class ED02_16_DivisionReal {

    public static void main(String[] args) {

        double dividendo = 15.0;
        double divisor = 0.0;

        double resultado = divisionReal(dividendo, divisor);
        System.out.println(dividendo + " / " + divisor + " = " + resultado);
    }

    public static double divisionReal(double x, double y) {
        return x / y;
    }
}
