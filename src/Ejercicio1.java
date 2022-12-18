
import java.util.Scanner;

public class Ejercicio1 {

       public static void main(String[] args) {

             //Realizamos el ejercicio con la clase Scanner

             Scanner sc = new Scanner(System.in);

             System.out.println("Introduce tu nombre: ");

             String nombre=sc.nextLine();

             System.out.println("Introduce tu edad: ");

             int edad = sc.nextInt();

             System.out.println("Te llamas "+nombre+" y tienes "+edad+" años.");

       }

}
