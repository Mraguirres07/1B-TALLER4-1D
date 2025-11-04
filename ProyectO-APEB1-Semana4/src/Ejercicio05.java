/**
 * Ejercicio05:Generar un algoritmo que permita calcular y mostrar el costos de 
 * una computadora de escritorio. La misma es comprada por partes; CPU, teclado,
 * pantalla, ratón.
 * @author Maria Aguirre
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio05 {//Inicio de la clase
    public static void main(String[] args) {//Inicio del main
        Scanner teclado = new Scanner(System.in);
        double Cpu, Teclado, Pantalla, Ratón, Costo;
        System.out.print("Ingrese el costo del cpu, teclado, pantalla y ratón:"
                + " ");
        Cpu = teclado.nextDouble();
        Teclado = teclado.nextDouble();
        Pantalla = teclado.nextDouble();
        Ratón = teclado.nextDouble();
        Costo = (Cpu + Teclado + Pantalla + Ratón);
        System.out.println("El costo de la computadora es: "+Costo);      
    } //Fin del main
}//Fin de la clase
/**
* run:
* Ingrese el costo del cpu, teclado, pantalla y ratón: 5 10 15 20
* El costo de la computadora es: 50.0
* BUILD SUCCESSFUL (total time: 10 seconds)
*/

