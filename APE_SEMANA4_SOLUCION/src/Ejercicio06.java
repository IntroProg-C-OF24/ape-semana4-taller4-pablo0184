/*
-Algoritmo06-
Generar un solución que permita calcular y mostrar el pago mensual de un préstamo de 1 año de plazo. 
Se debe ingresar el monto del préstamo y el interés mensual a cobrar.
 */
package ejercicio06;
/**
 *
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner prestamo = new Scanner(System.in);
        double valor1, valor2, valor3;
        System.out.println("Ingresa el monto del prestamo");
        valor1 = prestamo.nextDouble();
        System.out.println("Ingresa el valor del interes mensual");
        valor2 = prestamo.nextDouble();
        valor3 = (valor1/12)+valor2;
        System.out.println("El valortotal de pago mensual es:" + " " + valor3);
        // TODO code application logic here
    }
    
}
