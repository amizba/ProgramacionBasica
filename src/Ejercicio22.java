/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1;

        double num2;

        double resultado=0;

        //Nos pide los n�meros y el signo aritm�tico

        System.out.println("Escribe el primer n�mero: ");

        num1=sc.nextDouble();

        System.out.println("Escribe el signo aritm�tico: ");

        String operacion = sc.next();

        System.out.println("Escribe el segundo n�mero: ");

        num2=sc.nextDouble();

        //segun el signo aritm�tico, haremos una u otra accion

        switch (operacion){

            case "+":

                resultado=num1+num2;

                break;

            case "-":

                resultado=num1-num2;

                break;

            case "*":

                resultado=num1*num2;

                break;

            case "/":

                resultado=num1/num2;

                break;

            case "%":

                resultado=num1%num2;

                break;

        }

        System.out.println( num1+" "+operacion+" "+num2+" = "+resultado);

    }

}