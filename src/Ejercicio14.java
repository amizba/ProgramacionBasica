/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String contrasena="carpediem";

        final int TANTEOS = 3;

        //Esta variable booleana, nos controlara que en caso de que acierte la condicion cambie

        boolean acierto=false;

        String pass;

        for (int i=0;i<TANTEOS && !acierto;i++){

            System.out.println("Introduce una contraseña");

            pass = sc.next();

            //Comprobamos si coincide, no usamos ==, usamos el metodo equals

            if (pass.equals(contrasena)){

                System.out.println("Enhorabuena, acertaste");

                acierto=true;

            }

        }

    }

}