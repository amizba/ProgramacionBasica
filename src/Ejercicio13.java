/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import java.util.Scanner;

public class Ejercicio13 {

 

    public static void main(String[] args) {

 

        int codigo;

        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Introduce un numero mayor que 0");

            codigo=sc.nextInt();

        }while(codigo<=0);

 

        System.out.println(codigo);

    }

}
