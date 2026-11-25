package ed02_ejemplos_depuracion;

/**
 * ED02_08_Multiplos  ·  SOLUCIÓN
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
 *    Dice que 2, 3, 4, 8 y 9 no son múltiplos de 2, 3 ni 5.
 *    Solo 0 y 6 aparecen como múltiplos de 2 o de 3.
 *
 * 3. HIPÓTESIS
 *    La condición exige que sea múltiplo de 2 Y de 3 a la vez.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En el primer if, con i = 2.
 *
 * 5. ¿QUÉ OBSERVO?
 *    i % 2 == 0 -> true;  i % 3 == 0 -> false;  con && -> false.
 *    El mensaje dice "o", pero el código usa "&&" (y).
 *
 * 6. CORRECCIÓN
 *    Usar || :  if (i % 2 == 0 || i % 3 == 0)
 *
 * @author jm
 */
public class ED02_08_Multiplos {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            if (i % 2 == 0 || i % 3 == 0) {
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
