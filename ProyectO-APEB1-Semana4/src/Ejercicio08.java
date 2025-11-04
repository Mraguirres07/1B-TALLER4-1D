/**
 * Ejercicio08:Se debe generar una solución que permita calcular y mostrar el 
 * valor total a pagar mensual de servicios digitales de una persona. Los servi
 * cios digitales son: netflix, youtube premium, dropbox, spotify. Si la persona
 * es menor a 30 años se descuenta el 20% del total mensual.
 * @author Maria Aguirre
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio08 {//Inicio de la clase
    public static void main(String[] args) {//Inicio del main
        Scanner teclado = new Scanner(System.in);
        double netflix, youtube, dropbox, spotify, costo;
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        System.out.println("Ingrese el valor mensual por cada uno de los siguien"
                + "tes servicios: Netflix, Youtube, Dropbox y Spotify: ");
        netflix = teclado.nextDouble();
        youtube = teclado.nextDouble();
        dropbox = teclado.nextDouble();
        spotify = teclado.nextDouble();
        costo = netflix + youtube + dropbox + spotify;
        if (edad<30){//Inicio del si
            System.out.println("El valor mensual a pagar por los 4 servicios es:"
                    + " "+(costo-(costo*0.2)));}//Fin del si
        else {//Inicio del no
            System.out.println("El valor mensual a pagar por los 4 servicios es:"
                    + " "+costo); }//Fin del no
    }//Fin del main
}//Fin de la clase 
/**
 *run:
 * Ingrese su edad: 20
 * Ingrese el valor mensual por cada uno de los siguientes servicios: Netflix, 
 * Youtube, Dropbox y Spotify: 
 * 10 20 13 5
 * El valor mensual a pagar por los 4 servicios es: 38.4
 * BUILD SUCCESSFUL (total time: 20 seconds)
 */
