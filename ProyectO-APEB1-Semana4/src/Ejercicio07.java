/**
 * Ejercicio07:Generar un algoritmo que permita calcular y mostrar el valor a ca
 * ncelar de una planilla de luz. Se debe ingresar el valor de costo por kilovat
 * io/hora y el número de kilovatios consumidos en el mes. Si el usuario tiene 
 * edad mayor a 65 años, se debe descontar el 10%.
 * @author Maria Aguirre
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio07 {//Inicio de clase
    public static void main(String[] args) {//Inicio del main
        Scanner teclado = new Scanner(System.in);
        double kwH,kw,costo;
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        System.out.print("Ingrese el costo en kw/h y el nro de kw consumidos "
                + "al mes: ");
        kwH = teclado.nextDouble();
        kw = teclado.nextDouble();
        costo = kwH*kw;
        if (edad>65){//Inicio del si
            System.out.println("El valor a cancelar de luz es: "+(costo-
                    (costo*0.10)));}//Fin del si
        else {//Inicio del no
            System.out.println("El valor a cancelar de luz es: "+costo);
        }//Fin del no
    }//Fin del main
}//Fin de la clase 
/**
*run:
* Ingrese su edad: 70
* Ingrese el costo en kw/h y el nro de kw consumidos al mes: 14.6 680
* El valor a cancelar de luz es: 8935.2
* BUILD SUCCESSFUL (total time: 7 seconds)
*/
