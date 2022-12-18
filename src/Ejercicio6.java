/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import java.util.Scanner;

public class Ejercicio6 {

       public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);

             System.out.println("Introduce un número: ");

             int num=sc.nextInt();

             char car=(char) num; //Utilizamos el casting para convertir la variable entera a caracter

             System.out.println("El número introducido "+num+" su código ASCII es: "+car);


       }


}
