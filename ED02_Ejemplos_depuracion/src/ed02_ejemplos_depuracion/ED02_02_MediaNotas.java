package ed02_ejemplos_depuracion;

/**
 * ED02_02_MediaNotas  ·  SOLUCIÓN
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Seguir el valor de una variable dentro de un bucle con F8
 *    y en el panel Variables.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Calcular la nota media de 7, 4, 8 y 6. El resultado correcto es 6.25.
 *
 * 2. ¿QUÉ HACE?
 *    Muestra "La media es: 1.0".
 *
 * 3. HIPÓTESIS
 *    La suma no acumula las notas y la división pierde los decimales.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En "suma = ..." dentro del bucle y en la línea "media = ...".
 *
 * 5. ¿QUÉ OBSERVO?
 *    "suma" vale 7, 4, 8 y 6: en cada vuelta se SUSTITUYE en vez de sumarse.
 *    Al salir del bucle suma = 6 y media = 6 / 4 = 1.0: al dividir dos int
 *    el resultado es entero (1) aunque luego se guarde en un double.
 *
 * 6. CORRECCIÓN
 *    suma = suma + notas[i];                  (acumular)
 *    media = (double) suma / notas.length;    (división con decimales)
 *
 * @author jm
 */
public class ED02_02_MediaNotas {

    public static void main(String[] args) {

        int[] notas = {7, 4, 8, 6};
        int suma = 0;
        double media;

        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        media = (double) suma / notas.length;

        System.out.println("La media es: " + media);
    }
}
