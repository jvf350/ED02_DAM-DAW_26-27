package ed02_ejemplos_depuracion;

/**
 * ED02_03_TablaMultiplicar  ·  SOLUCIÓN
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Seguir un bucle paso a paso y detectar un bucle infinito.
 *    Además, las variables tienen nombres MUY poco claros a propósito:
 *    fíjate en lo difícil que es seguirlas (z04l32 lleva una "ele",
 *    z04532 un "cinco" y z04132 un "uno").
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Mostrar la tabla de multiplicar del 3, desde 3 x 1 = 3 hasta 3 x 9 = 27.
 *
 * 2. ¿QUÉ HACE?
 *    Repite "3 x 1 = 3" sin parar: es un bucle infinito.
 *
 * 3. HIPÓTESIS
 *    La variable de la condición del while nunca cambia.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En la multiplicación de dentro del do, avanzando con F8.
 *
 * 5. ¿QUÉ OBSERVO?
 *    z04l32 vale siempre 3, z04532 vale siempre 1 y z04132 siempre 3.
 *    La condición es z04532 < 10, y como z04532 no aumenta, 1 < 10 es
 *    siempre cierto. Con estos nombres es muy fácil confundir variables.
 *
 * 6. CORRECCIÓN
 *    Falta incrementar el multiplicador al final del bucle. Además se han
 *    renombrado las variables: z04l32 -> tabla, z04532 -> multiplicador,
 *    z04132 -> resultado.
 *
 * @author jm
 */
public class ED02_03_TablaMultiplicar {

    public static void main(String[] args) {

        int tabla = 3;
        int multiplicador = 1;
        int resultado;

        do {
            resultado = multiplicador * tabla;
            System.out.println(tabla + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        } while (multiplicador < 10);
    }
}
