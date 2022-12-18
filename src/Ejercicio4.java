/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import java.util.Scanner;

 

public class Ejercicio4 {

 

       public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);

            

             System.out.println("Introduce el primer número: ");

             int num1=sc.nextInt();

             System.out.println("Introduce el segundo número: ");

             int num2=sc.nextInt();

            

             if(num1>num2) {

                   

                    System.out.println("El número "+num1+" es mayor");

             }else {

                    System.out.println("El número "+num2+" es mayor");

             }

 

       }

 

}
