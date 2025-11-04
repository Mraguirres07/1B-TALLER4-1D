/**
 * Ejercicio02: Generar un algoritmo que permite ingresar los gastos de tres hij
 * os de un padre de familia; calcular y mostrar el total de gastos de los hijos
 * del padre de familia.
 * @author Maria Aguirre
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio02 { //Inicio de la clse
    public static void main(String[] args) {//Inicio del main
        Scanner teclado = new Scanner(System.in);
        double hijo1, hijo2, hijo3, gastos;
        System.out.print("Ingrese los gastos de cada hijo: ");
        hijo1 = teclado.nextDouble();
        hijo2 = teclado.nextDouble();
        hijo3 = teclado.nextDouble();
        gastos = (hijo1 + hijo2 + hijo3);
        System.out.println("El total de gastos de sus tres hijos es de: "
                +gastos);    
    }//Fin del main  
}//Fin de la clase
/**
 * run:
 * Ingrese los gastos de cada hijo: 20 67 80
 * El total de gastos de sus tres hijos es de: 167.0
 * BUILD SUCCESSFUL (total time: 8 seconds)
*/