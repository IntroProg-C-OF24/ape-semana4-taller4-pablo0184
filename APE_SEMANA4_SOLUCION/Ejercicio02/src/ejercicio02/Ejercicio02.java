/*
-Algoritmo02-
Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; 
Calcular y mostrar el total de gastos de los hijos del padre de familia.
 */
import java.util.Scanner;
/**
 * @autor: Pablo Velez
 */

public class Ejercicio02 {
    public static void main(String[]arg){
        double gastosHijos1, gastosHijos2, gastosHIjos3, gastosTotales;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese gastos del hijo 1: ");
        gastosHijos1 = teclado.nextDouble();
        System.out.println("Ingrese gastos del hijo 2");
        gastosHijos2 = teclado.nextDouble();
        System.out.println("Ingrerse gastos del hijo 3");
        gastosHIjos3 = teclado.nextDouble();
        
        gastosTotales = gastosHijos1 + gastosHijos2 + gastosHIjos3;
        System.out.println("gastos totales son: " + gastosTotales);
    }
    
}
