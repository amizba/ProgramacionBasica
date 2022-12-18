/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import java.util.Scanner;

public class Ejercicio12 {

       public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);

             System.out.println("Escribe un día de la semana");

             String diaSem = sc.next();

             switch(diaSem) {

             case "lunes":

                    System.out.println("Es laborable");

                    break;

             case "martes":

                    System.out.println("Es laborable");

                    break;

             case "miercoles":

                    System.out.println("Es laborable");

                    break;

             case "jueves":

                    System.out.println("Es laborable");

                    break;

             case "viernes":

                    System.out.println("Es laborable");

                    break;

             case "sabado":

                    System.out.println("No es laborable");

                    break;

             case "domingo":

                    System.out.println("No es laborable");

                    break;

                    default:

                           System.out.println("No has introducido correctamente el día de la semana");

             }

       }

}
