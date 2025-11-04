/**
 * Ejercicio03:Se desea desarrollar un algoritmo que permita mostrar la tabla de
 * multiplicar de un número ingresado por el usuario; solo en el caso que el val
 * or del número esté entre 2 y 6. No use aún, ciclos repetitivos.
 * @author Maria Aguirre
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio03 {//Inicio de la clase
    public static void main(String[] args) {//Inicio del main
        Scanner teclado = new Scanner(System.in);
        int tabla;
        System.out.print("¿Qué tabla deseas? (2-6): ");
        tabla = teclado.nextInt();
        if ((tabla>= 2)&&(tabla<=6)) { //Inicio del si
            System.out.println(tabla+ "*" +1+ "="+(tabla*1));
            System.out.println(tabla+ "*" +2+ "="+(tabla*2));
            System.out.println(tabla+ "*" +3+ "="+(tabla*3));
            System.out.println(tabla+ "*" +4+ "="+(tabla*4));
            System.out.println(tabla+ "*" +5+ "="+(tabla*5));
            System.out.println(tabla+ "*" +6+ "="+(tabla*6));
            System.out.println(tabla+ "*" +7+ "="+(tabla*7));
            System.out.println(tabla+ "*" +8+ "="+(tabla*8));
            System.out.println(tabla+ "*" +9+ "="+(tabla*9));
            System.out.println(tabla+ "*" +10+ "="+(tabla*10));
            System.out.println(tabla+ "*" +11+ "="+(tabla*11));
            System.out.println(tabla+ "*" +12+ "="+(tabla*12)); }//Fin del si
        else { // Inicio del no
            System.out.println("NO TE PUEDO PRESENTAR ESA TABLA!");}//Fin del no         
    }//Fin del main
}//Fin de la clase
/**
 * run:
 * ¿Qué tabla deseas? (2-6): 5
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50
5*11=55
5*12=60
* BUILD SUCCESSFUL (total time: 3 seconds)
*/