package ed02_ejemplos_depuracion;

/**
 * ED02_12_PotenciasDeDos  ·  SOLUCIÓN
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Puntos de interrupción condicionales: que el programa solo se pare
 *    cuando se cumpla una condición, en lugar de pulsar F8 cincuenta veces.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Mostrar 50 potencias de 2 seguidas: 4, 8, 16, 32, 64...
 *    Cada número es el doble del anterior.
 *
 * 2. ¿QUÉ HACE?
 *    Va bien hasta 1073741824; luego muestra -2147483648 y después ceros.
 *
 * 3. HIPÓTESIS
 *    El número se hace demasiado grande para un int.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En numero = numero * 2, con la condición vueltas == 29.
 *
 * 5. ¿QUÉ OBSERVO?
 *    Antes de multiplicar numero = 1073741824; después -2147483648.
 *    Integer.MAX_VALUE es 2147483647: el doble no cabe en un int y el valor
 *    "da la vuelta" a los negativos (desbordamiento). No salta ningún error.
 *
 * 6. CORRECCIÓN
 *    Usar long, que admite números hasta 9223372036854775807:
 *    long numero = 2;
 *
 * @author jm
 */
public class ED02_12_PotenciasDeDos {

    public static void main(String[] args) {

        long numero = 2;
        int vueltas = 0;

        do {
            numero = numero * 2;
            System.out.println(numero);
            vueltas++;
        } while (vueltas < 50);
    }
}
