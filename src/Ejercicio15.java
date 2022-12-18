/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import java.util.Scanner;

public class Ejercicio15 {

 

    public static void main(String[] args) {

 

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");

        int num1=sc.nextInt();

 

        System.out.println("Introduce el segundo número");

        int num2=sc.nextInt();

 

        for (int i=0;i<100;i++){

            //Generamos un numero aleatorio

            int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2);

            System.out.println(numAleatorio);

        }

    }

}
