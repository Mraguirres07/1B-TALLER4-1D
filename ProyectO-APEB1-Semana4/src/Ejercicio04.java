/**
 * Ejercicio04:Generar un algoritmo que permita calcular y mostrar el valor de 
 * la planilla de teléfono de un casa. Se debe ingresar el costo por minutos, el 
 * número de minutos consumidos en el mes.
 * @author Maria Aguirre
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio04 { //Incio de la clase 
    public static void main(String[] args) {//Inicio del main
        Scanner teclado = new Scanner(System.in);
        double costoxmin, valor;
        int min;
        System.out.print("Ingrese el costo por minutos y el nro de minutos con"
                + "sumidos en el mes: ");
        costoxmin = teclado.nextDouble();
        min = teclado.nextInt();
        valor = (costoxmin * min);
        System.out.println("El valor de su planilla de teléfono es: "+valor);      
    }//Fin del main
}//Fin de la clase
/**
* run:
* Ingrese el costo por minutos y el nro de minutos consumidos en el mes: 14 600
* El valor de su planilla de teléfono es: 8400.0
* BUILD SUCCESSFUL (total time: 9 seconds)
*/

