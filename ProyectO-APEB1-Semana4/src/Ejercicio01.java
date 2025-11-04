/**
 * Ejercicio01:Generar un algoritmo que permite calcular y presentar el área de
 * un triángulo. Los datos deben ser pedidos al usuario.
 * @author Maria Aguirre
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio01 { //Inicio de la clase 
    public static void main(String[] args) { //Inicio del main
        Scanner teclado = new Scanner(System.in);
        double base, altura, area;
        System.out.print("Ingrese la base y la altura del triángulo: ");
        base = teclado.nextDouble();
        altura = teclado.nextDouble();
        area = (base*altura)/2;
        System.out.println("El área del triángulo es: "+area);        
    }//Fin del main
}//Fin de la clase
/**
 * run:
 * Ingrese la base y la altura del triángulo: 5 4
 * El área del triángulo es: 10.0
 * BUILD SUCCESSFUL (total time: 6 seconds)
*/