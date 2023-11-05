/*
-Algoritmo05-
Generar un algoritmo que permita calcular y mostrar el costo de una computadora de escritorio. 
La misma es comprada por partes; CPU, teclado, pantalla, ratón.
*/
package ejercicio05;
/**
 * @author: Pablo Velez
 */
import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner computadora = new Scanner(System.in);
        double costo1, costo2, costo3, costo4, costo5;
        System.out.println("Ingresa el costo del CPU");
        costo1 = computadora.nextDouble();
        System.out.println("Ingresa el costo del teclado");
        costo2 = computadora.nextDouble();
        System.out.println("Ingresa el costo de la pantalla");
        costo3 = computadora.nextDouble();
        System.out.println("Ingresa el costo de el raton");
        costo4 = computadora.nextDouble();
        costo5 = costo1 + costo2 + costo3 + costo4;
        System.out.println("El total a pagar es: " + costo5);
        // TODO code application logic here
    }
    
}
