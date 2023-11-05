/*
-Algoritmo04-
Generar un algoritmo que permita calcular y mostrar el valor de la planilla de teléfono de un casa. 
Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes.
 */
package ejercicio04;

/**
 *
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner planilla = new Scanner(System.in);
        double costo1, costo2, costo3;
        System.out.println("Ingresa el valor del costo por minuto");
        costo1 = planilla.nextDouble();
        System.out.println("Ingresa el valor de los minutos consumidos");
        costo2 = planilla.nextDouble();
        costo3 = costo1 * costo2;
        System.out.println("El valor de la planilla a pagar es: $" + costo3);
        
        // TODO code application logic here
    }
    
}
