/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import java.util.Scanner;

 

public class Ejercicio8 {

 

       public static void main(String[] args) {

            

             Scanner sc = new Scanner(System.in);

             System.out.println("Introduce el radio ");

            

             double radio=sc.nextDouble();

            

             //F�rmula del �rea del cirulo

            

             double area=Math.PI*Math.pow(radio, 2);

            

             System.out.println("El �rea del circulo es "+area);

 

       }

 

}
