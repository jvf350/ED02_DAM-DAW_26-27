package ed02_ejemplos_depuracion;

/**
 * ED02_16_DivisionReal  ·  SOLUCIÓN
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
 *    Muestra "15.0 / 0.0 = Infinity". No hay ningún error en rojo.
 *
 * 3. HIPÓTESIS
 *    Con double, dividir entre 0 no lanza excepción: da Infinity.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En la llamada a divisionReal(...) del main, entrando con F7.
 *
 * 5. ¿QUÉ OBSERVO?
 *    x = 15.0 e y = 0.0. x / y da Infinity. El programa "funciona", pero
 *    el resultado no sirve: es un error silencioso, más difícil de ver.
 *
 * 6. CORRECCIÓN
 *    Comprobar en el main que el divisor no es 0 antes de llamar al método
 *    y avisar en ese caso.
 *
 * @author jm
 */
public class ED02_16_DivisionReal {

    public static void main(String[] args) {

        double dividendo = 15.0;
        double divisor = 0.0;

        if (divisor != 0) {
            double resultado = divisionReal(dividendo, divisor);
            System.out.println(dividendo + " / " + divisor + " = " + resultado);
        } else {
            System.out.println("No se puede dividir entre 0");
        }
    }

    public static double divisionReal(double x, double y) {
        return x / y;
    }
}
