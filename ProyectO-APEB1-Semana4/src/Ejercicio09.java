/**
 * Ejercicio09: Desarrolle una solución que determine el estado académico de una
 * persona estudiante en una asignatura universitaria a partir de una calificaci
 * ón de evaluación continua, una calificación de examen final y un porcentaje 
 * de asistencia. La regla institucional establece que:
 * La asistencia mínima debe alcanzarse para ser evaluado
 * Existe una nota mínima en el examen final, y
 * La nota final se calcula combinando evaluación continua y examen final.
 * La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la 
 * nota final redondeada a un decimal.
 * @author Maria Aguirre
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio09 {//Inicio de la clase
    public static void main(String[] args) {//Inicio del main
        Scanner teclado = new Scanner(System.in);
        double EC, EF, asistencia, NotaFinal;
        String rojo = "\u001B[31m";
        String verde = "\u001B[32m";
        String amarillo = "\u001B[33m";
        String reset = "\u001B[0m";
        System.out.println("Ingrese su calificación de la evaluación continua y "
                + "el examen final: ");
        EC = teclado.nextDouble();
        EF = teclado.nextDouble();
        NotaFinal = (EC + EF)/2.0;
        System.out.print("Ingrese su porcentaje de asistencia: ");
        asistencia = teclado.nextDouble();
        if (NotaFinal>=7.0 && asistencia>=80.0){
            System.out.println("Su nota final es: "+Math.round(NotaFinal*100.0)
                    /100.0);
            System.out.println(verde+"----APROBADO----"+reset);}
        else if (NotaFinal<=3.0 && asistencia<=50.0){
            System.out.println("Su nota final es: "+Math.round(NotaFinal*100)
                    /100);
            System.out.println(rojo+"----REPROBADO----"+reset);}
        else {
            System.out.println("Su nota final es: "+Math.round(NotaFinal*100.0)
                    /100.0);
            System.out.println(amarillo+"----SUPLETORIO----"+reset);}
    }//Fin del main
}//fin de la clase
/**
 * run:
 * Ingrese su calificación de la evaluación continua y el examen final: 
 * 5.78999 9
 * Ingrese su porcentaje de asistencia: 88.5
 * Su nota final es: 7.39
 * ----APROBADO----
BUILD SUCCESSFUL (total time: 19 seconds)
 */

   

