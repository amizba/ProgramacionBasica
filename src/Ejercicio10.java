/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import java.util.Scanner;

public class Ejercicio10 {

       public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);

               System.out.print("Inserta un número del 1 al 9: ");

               int num = sc.nextInt();

               for(int i = 1; i<=num; i++)

               {

                   for(int j = 1; j <= 10; j++)

                   {

                       System.out.println(i + " X " + j + " = " + i*j);

                   }

                   System.out.println();

               }

}

}
