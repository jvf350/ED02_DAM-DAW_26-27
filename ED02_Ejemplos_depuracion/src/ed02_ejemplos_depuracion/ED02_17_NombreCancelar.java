package ed02_ejemplos_depuracion;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * ED02_17_NombreCancelar  ·  SOLUCIÓN
 *
 * QUÉ PRACTICAS CON EL DEPURADOR
 *    Entender un NullPointerException: ver en el panel Variables que una
 *    variable vale null y evaluar (Alt+F8) qué pasa al usarla.
 *    Nota: usa ventanas (JOptionPane), así que funciona en IntelliJ pero
 *    no en Codespaces.
 *
 * 1. ¿QUÉ DEBERÍA HACER?
 *    Pedir tu nombre en una ventana y saludarte. Si no escribes nada o
 *    pulsas Cancelar, debe mostrar "No has introducido un nombre" y volver
 *    a pedirlo. Después de saludarte, pregunta si quieres salir.
 *
 * 2. ¿QUÉ HACE?
 *    Con un nombre funciona. Sin escribir nada muestra el error y vuelve a
 *    pedirlo (bien). Al pulsar Cancelar el programa termina con
 *    NullPointerException en la línea del if.
 *
 * 3. HIPÓTESIS
 *    Al pulsar Cancelar, showInputDialog devuelve null, no un texto vacío.
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    En el if que comprueba el nombre, pulsando Cancelar.
 *
 * 5. ¿QUÉ OBSERVO?
 *    nombre = null.
 *    nombre == null        -> true
 *    nombre.equals("")     -> NullPointerException: no se puede llamar a
 *                             un método de algo que no existe.
 *    nombre.equals(null)   -> NullPointerException por lo mismo.
 *    Si "nombre" no fuera null, nombre.equals(null) daría SIEMPRE false.
 *    Esa comprobación no sirve nunca.
 *
 * 6. CORRECCIÓN
 *    Comprobar primero si es null con "==" y después si está vacío:
 *    if (nombre == null || nombre.equals(""))
 *    El orden importa: si nombre == null es true, "||" ya no evalúa la
 *    segunda parte (evaluación en cortocircuito) y no se produce el error.
 *
 * @author jm
 */
public class ED02_17_NombreCancelar {

    public static void main(String[] args) {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String nombre;
        boolean salir = false;

        do {
            nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre:");
            String hora = formato.format(new Date());

            if (nombre == null || nombre.equals("")) {
                System.out.println(hora + " No se ha introducido un nombre");
                JOptionPane.showMessageDialog(null, "No has introducido un nombre",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println(hora + " Nombre introducido: " + nombre);
                int opcion = JOptionPane.showConfirmDialog(null,
                        "Hola " + nombre + ", ¿quieres salir del programa?",
                        "Salir", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    salir = true;
                }
            }
        } while (!salir);

        System.out.println("Fin del programa");
    }
}
