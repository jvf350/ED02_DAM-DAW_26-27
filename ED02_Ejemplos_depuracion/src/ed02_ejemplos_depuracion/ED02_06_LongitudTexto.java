package ed02_ejemplos_depuracion;

/**
 * ED02_06_LongitudTexto
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Cambiar el valor de una variable mientras el programa está parado (F2)
 *    para probar casos que el programa no prueba por sí solo.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Decir si el texto tiene menos de 10 caracteres, más de 10 o justo 10.
 *
 * 2. ¿QUÉ HACE?
 *    Ejecútalo. Con el texto actual, ¿parece que funciona bien?
 *
 * 3. HIPÓTESIS
 *    ¿Hay algún texto con el que no se muestre nada? ¿Cuál?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en el primer if. Cuando se pare, cambia el valor
 *    de "texto" (F2) por otro de exactamente 10 caracteres,
 *    por ejemplo "Hola mundo", y continúa con F8.
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿Por qué rama del if pasa? ¿Qué se muestra?
 *    Prueba también con un texto corto y con uno largo.
 *
 * 6. CORRECCIÓN
 *    ¿Qué caso falta en el if?
 *
 * @author jm
 */
public class ED02_06_LongitudTexto {

    public static void main(String[] args) {

        String texto = "Java desde 0";

        if (texto.length() < 10) {
            System.out.println("\"" + texto + "\" tiene menos de 10 caracteres");
        } else if (texto.length() > 10) {
            System.out.println("\"" + texto + "\" tiene más de 10 caracteres");
        }
    }
}
