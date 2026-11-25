package ed02_ejemplos_depuracion;

/**
 * ED02_01_PrimerosPasos
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
 *    Ejecútalo (Shift+F10) y anota lo que muestra.
 *
 * 3. HIPÓTESIS
 *    Al hacer "b = b + 1", ¿cambia también "a"? ¿Por qué?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: haz clic en el margen de la línea 40 (int a = 1;) y lanza
 *    el depurador (Shift+F9). Avanza con F8 línea a línea.
 *
 * 5. ¿QUÉ OBSERVO?
 *    Fíjate en el panel Variables y en los valores en gris junto al código
 *    después de cada F8. Repite el proceso y, al llegar a la línea 41,
 *    cambia el valor de "a" a 10 (clic derecho > Set Value o F2).
 *    ¿Qué se muestra ahora por pantalla?
 *
 * 6. CORRECCIÓN
 *    No hay nada que corregir. Escribe qué has aprendido.
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
