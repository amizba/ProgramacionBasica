/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import java.util.Scanner;

public class Ejercicio4 {

       public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);

             System.out.println("Introduce el primer n�mero: ");

             int num1=sc.nextInt();

             System.out.println("Introduce el segundo n�mero: ");

             int num2=sc.nextInt();

             if(num1>num2) {

                    System.out.println("El n�mero "+num1+" es mayor");

             }else {

                    System.out.println("El n�mero "+num2+" es mayor");

             }

       }

}