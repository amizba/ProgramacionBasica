/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import javax.swing.JOptionPane;

 

public class Ejercicio21 {

 

    public static void main(String[] args) {

      

        String texto= JOptionPane.showInputDialog("Introduce una frase");

        

      

        String resumen = texto.substring(4, 8);

     

        System.out.println(resumen);

        

    }

    

}