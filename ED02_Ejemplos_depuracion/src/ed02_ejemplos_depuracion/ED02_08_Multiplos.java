package ed02_ejemplos_depuracion;

/**
 * ED02_08_Multiplos
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Evaluar expresiones mientras el programa está parado (Alt+F8),
 *    por partes, para ver qué parte de una condición falla.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Para cada número del 0 al 9, decir si es múltiplo de 2 o de 3,
 *    si es múltiplo de 5, o si no es múltiplo de ninguno.
 *    Por ejemplo: 2, 3, 4 y 6 son múltiplos de 2 o de 3.
 *
 * 2. ¿QUÉ HACE?
 *    Ejecútalo. ¿Qué números están mal clasificados?
 *
 * 3. HIPÓTESIS
 *    ¿Qué parte de la primera condición crees que falla?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en el primer if. Avanza con F9 hasta que "i" valga 2
 *    y evalúa con Alt+F8, por separado:
 *       i % 2 == 0
 *       i % 3 == 0
 *       i % 2 == 0 && i % 3 == 0
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿Qué devuelve cada expresión? ¿Coincide con lo que dice el mensaje?
 *
 * 6. CORRECCIÓN
 *    ¿Qué operador lógico debe usarse?
 *
 * @author jm
 */
public class ED02_08_Multiplos {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " es múltiplo de 2 o de 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " es múltiplo de 5");
            } else {
                System.out.println(i + " no es múltiplo de 2, 3 ni 5");
            }
            i++;
        }
    }
}
