/**
 * Ejercicio06:Generar un solución que permita calcular y mostrar el pago mensua
 * l de un préstamo de 1 año de plazo. Se debe ingresar el monto del préstamo y 
 * el interés mensual a cobrar.
 * @author Maria Aguirre
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio06 {//Inicio de la clase
    public static void main(String[] args) {//Inicio del main
        Scanner teclado = new Scanner(System.in);
        double prestamo, tasaInteres, pagoMensual;
        System.out.print("Ingrese el monto del prestamo y la tasa de interés: "
                + "");
        prestamo = teclado.nextDouble();
        tasaInteres = teclado.nextDouble();
        pagoMensual = (prestamo + (prestamo*(tasaInteres/100)))/12;
        System.out.println("El pago mensual de su préstamo es: "+pagoMensual);
    }//Fin del main 
}//Fin de la clase 
/**
 * run:
 * Ingrese el monto del prestamo y la tasa de interés: 8000 2
 * El pago mensual de su préstamo es: 680.0
 * BUILD SUCCESSFUL (total time: 5 seconds)
*/
