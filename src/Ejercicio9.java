/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import java.util.Scanner;

public class Ejercicio9 {

       public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);

             System.out.println("Introduce un n�mero");

             int num=sc.nextInt();

             if(num%2==0) {

                    System.out.println("El n�mero "+num+" es divisible entre 2");

             }else {

                    System.out.println("El n�mero "+num+" no es divisible entre 2");

             }

       }

}
