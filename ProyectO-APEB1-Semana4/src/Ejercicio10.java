/**
 * Ejercicio10:El programa debe calcular el área del polígono. La figura se comp
 * one de un cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, 
 * E), cuya base mide lo mismo que uno de los lados del cuadrado, y un rectángu
 * lo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado, mientras 
 * que la altura mide lo mismo que la altura de los triángulos. Se pide que haga
 * un programa que calcule el área total.
 * Por cultura general, sabemos que el área de un rectángulo se calcula multipli
 * cando su base por su altura; el área de un triángulo rectángulo se calcula 
 * multiplicando su base por su altura, y luego dividiendo el resultado entre 
 * dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado la me
 * dida de uno de sus lados.
 * La parte interesante de este problema es determinar el mínimo número de datos
 * que hay que preguntar. 
 * @author Maria Aguirre
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio10 {//inicio de la clase
    public static void main(String[] args) {//Inicio del main
        Scanner teclado = new Scanner(System.in);
        double base, altura, AR, AT, AC, AreaTotal;
        System.out.print("Ingrese el valor de la base y la altura del rectángu"
                + "lo: ");
        base = teclado.nextDouble();
        altura = teclado.nextDouble();
        AR = base*altura;
        AT = ((base*altura)/2)*3;
        AC = Math.pow(base,2);
        AreaTotal = AR + AT + AC;
        System.out.println("El área total del polígono es: "+AreaTotal);
    }//Fin del main
}//Fin de la clase 
/**
 * run:
 * Ingrese el valor de la base y la altura del rectángulo: 20 13
 * El área total del polígono es: 1050.0
 * BUILD SUCCESSFUL (total time: 19 seconds)
 */
