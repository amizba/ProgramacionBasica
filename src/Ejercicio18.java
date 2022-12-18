/*
 * @author Amparo Izquierdo
 * amizba@gmail.com
 */
import javax.swing.JOptionPane;

 

public class Ejercicio18 {

 

    public static void main(String[] args) {

 

        String texto=JOptionPane.showInputDialog("Introduce una frase");

 

        int contador=0;

        for (int i=0;i<texto.length();i++){

            //Comprobamos si el caracter es una vocal

            if(texto.charAt(i)=='a' ||

                    texto.charAt(i)=='e' ||

                    texto.charAt(i)=='i' ||

                    texto.charAt(i)=='o' ||

                    texto.charAt(i)=='u'){

                contador++;

            }

        }

 

        System.out.println("Hay "+contador+" vocales");

    }

}