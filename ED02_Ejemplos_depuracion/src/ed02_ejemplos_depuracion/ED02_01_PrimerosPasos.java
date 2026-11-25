package ed02_ejemplos_depuracion;

/**
 * ED02_01_PrimerosPasos  ·  SOLUCIÓN
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Poner un punto de interrupción, avanzar línea a línea (F8),
 *    ver las variables en el panel Variables y cambiar su valor (F2).
 *    Este programa NO tiene errores: sirve para conocer la herramienta.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Guardar 1 en "a", copiar "a" en "b", sumar 1 a "b" y mostrar
 *    los dos valores: "a vale 1 y b vale 2".
 *
 * 2. ¿QUÉ HACE?
 *    Muestra "a vale 1 y b vale 2". Funciona correctamente.
 *
 * 3. HIPÓTESIS
 *    "b = a" copia el VALOR de "a" en "b"; después son variables
 *    independientes, así que cambiar "b" no cambia "a".
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En la línea de "int a = 1;", avanzando con F8.
 *
 * 5. ¿QUÉ OBSERVO?
 *    Tras cada F8 aparece o cambia una variable en el panel Variables:
 *    a = 1, luego b = 1, luego b = 2. Si al llegar a "int b = a;"
 *    cambiamos "a" a 10 con F2, se muestra "a vale 10 y b vale 11":
 *    el depurador permite probar otros valores sin tocar el código.
 *
 * 6. CORRECCIÓN
 *    No hay errores.
 *
 * @author jm
 */
public class ED02_01_PrimerosPasos {

    public static void main(String[] args) {

        int a = 1;
        int b = a;
        b = b + 1;
        System.out.println("a vale " + a + " y b vale " + b);
    }
}
