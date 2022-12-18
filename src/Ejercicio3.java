/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import javax.swing.JOptionPane;

public class Ejercicio3 {

       public static void main(String[] args) {

             String precio = JOptionPane.showInputDialog("Introduce el precio del producto");

             int precio2 = Integer.parseInt(precio); //Convertimos la variable String a entero

             final double IVA = 0.21;

             double prTotal = (precio2*IVA)+precio2;

             System.out.println("El precio del producto es: "+precio2+" euros");

             System.out.println("El precio total del producto con IVA es "+prTotal+" euros.");

       }

}
