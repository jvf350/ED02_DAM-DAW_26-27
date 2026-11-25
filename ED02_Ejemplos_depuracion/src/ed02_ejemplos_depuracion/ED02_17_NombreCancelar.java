package ed02_ejemplos_depuracion;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * ED02_17_NombreCancelar
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
 *    Pruébalo tres veces: escribiendo un nombre, pulsando Aceptar sin
 *    escribir nada y pulsando Cancelar. ¿Qué pasa en cada caso?
 *
 * 3. HIPÓTESIS
 *    ¿Qué devuelve showInputDialog cuando pulsas Cancelar?
 *
 * 4. PUNTO DE INTERRUPCIÓN
 *    Pista: ponlo en la línea del if que comprueba el nombre.
 *    Pulsa Cancelar y, cuando se pare, mira "nombre" en el panel Variables.
 *    Evalúa (Alt+F8) estas expresiones, una a una:
 *       nombre == null
 *       nombre.equals("")
 *       nombre.equals(null)
 *
 * 5. ¿QUÉ OBSERVO?
 *    ¿Qué valor tiene "nombre"? ¿Qué expresiones dan error y cuáles no?
 *    Si "nombre" NO fuera null, ¿qué devolvería nombre.equals(null)?
 *    Entonces, ¿sirve para algo esa comprobación?
 *
 * 6. CORRECCIÓN
 *    ¿Cómo se comprueba si una variable es null? ¿En qué orden deben ir
 *    las dos comprobaciones del if? ¿Por qué importa el orden?
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

            if (nombre.equals("") || nombre.equals(null)) {
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
