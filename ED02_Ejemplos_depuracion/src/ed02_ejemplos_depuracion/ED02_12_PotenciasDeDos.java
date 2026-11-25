package ed02_ejemplos_depuracion;

/**
 * ED02_12_PotenciasDeDos
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
 *    Ejecútalo y revisa la salida entera. ¿Son todos correctos?
 *
 * 3. HIPÓTESIS
 *    ¿Por qué aparece un número negativo y luego ceros?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en la línea de numero = numero * 2. Haz clic derecho
 *    sobre el punto rojo y escribe en "Condition":  vueltas == 29
 *    Otra opción: ponlo en el println con la condición  numero < 0
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿Qué valor tiene "numero" justo antes y justo después de multiplicar?
 *    Evalúa (Alt+F8) Integer.MAX_VALUE. ¿Qué tiene que ver?
 *
 * 6. CORRECCIÓN
 *    ¿Qué tipo de dato admite números más grandes que int?
 *
 * @author jm
 */
public class ED02_12_PotenciasDeDos {

    public static void main(String[] args) {

        int numero = 2;
        int vueltas = 0;

        do {
            numero = numero * 2;
            System.out.println(numero);
            vueltas++;
        } while (vueltas < 50);
    }
}
