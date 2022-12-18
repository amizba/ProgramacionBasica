/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] ar) {

        Scanner sc=new Scanner(System.in);

        int suma,cant,valor,prom;

        suma=0;

        cant=0;

        do {

            System.out.print("Inserta un valor (0  finaliza):");

            valor=sc.nextInt();

            if (valor!=0) {

                suma=suma+valor;

                cant++;

            }

        } while (valor!=0);

        if (cant!=0) {

            prom=suma/cant;

            System.out.print("El promedio de los valores ingresados es:");

            System.out.print(prom);

        } else {

            System.out.print("No se ingresaron valores.");

        }

    }

}
