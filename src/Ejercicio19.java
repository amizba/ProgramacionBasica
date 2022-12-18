/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import javax.swing.JOptionPane;

public class Ejercicio19 {

    public static void main(String[] args) {

        String texto=JOptionPane.showInputDialog("Introduce una frase");

        //Aviso, de esta forma no modifica el String original

        System.out.print(texto.replace('a', 'e'));

    }

}
