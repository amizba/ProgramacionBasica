/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import java.util.Scanner;

 

public class Ejercicio16 {

 

       public static void main(String[] args) {

             // Supongamos que tenemos que introducir un n�mero de 1, 2, 3 o 4 cifras

             Scanner sc = new Scanner(System.in);

             System.out.println("Introduce un n�mero: ");

             int num=sc.nextInt();

            

             if(num>=0 && num<=9) {

                   

                    System.out.println("El n�mero introducido tiene una cifra");

             }else if(num>=10 && num<=99) {

                    System.out.println("El n�mero introducido tiene dos cifras");

                   

             }else if(num>=100 && num<=999) {

                    System.out.println("El n�mero introducido tiene tres cifras");

                   

             }else if(num>=1000 && num<=9999) {

                    System.out.println("El n�mero introducido tiene cuatro cifras");

                   

             }else {

                   

                    System.out.println("No has introducido un n�mero correcto");

             }

 

       }

 

}
