package ed02_ejemplos_depuracion;

/**
 * ED02_06_LongitudTexto  ·  SOLUCIÓN
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Cambiar el valor de una variable mientras el programa está parado (F2)
 *    para probar casos que el programa no prueba por sí solo.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Decir si el texto tiene menos de 10 caracteres, más de 10 o justo 10.
 *
 * 2. ¿QUÉ HACE?
 *    Con "Java desde 0" (12 caracteres) dice que tiene más de 10. Parece
 *    que funciona.
 *
 * 3. HIPÓTESIS
 *    Con un texto de exactamente 10 caracteres no se muestra nada.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En el primer if, cambiando "texto" a "Hola mundo" con F2.
 *
 * 5. ¿QUÉ OBSERVO?
 *    Con 10 caracteres no es "< 10" ni "> 10": no entra en ninguna rama
 *    y no se muestra nada. El caso límite no estaba contemplado.
 *
 * 6. CORRECCIÓN
 *    Añadir un else final para el caso de 10 caracteres.
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
        } else {
            System.out.println("\"" + texto + "\" tiene exactamente 10 caracteres");
        }
    }
}
