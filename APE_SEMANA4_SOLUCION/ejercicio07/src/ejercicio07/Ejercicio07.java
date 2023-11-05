/*
-Ejercicio07-
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%
 */
package ejercicio07;
/**
 *
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner Planilla = new Scanner(System.in);
        double valor1, valor2, valor3, valor4, valor5;
        System.out.println("Dame el valor del costo por Kilovatio/hora");
        valor1 = Planilla.nextDouble();
        System.out.println("Dame el valor de los kilovatios consumidos en el mes");
        valor2 = Planilla.nextDouble();
        System.out.println("Dame tu edad");
        valor3 = Planilla.nextDouble();
        valor4 = valor1*valor2;
        if (valor3 >= 65) {
            valor5 = valor4*10/100;
            valor4 = valor4 - valor4;
            System.out.println("El valor de la planilla es:" + " " + valor4);  
        }
        else {
            System.out.println("El valor de la planilla es" + " " + valor4);
        }
    }   
}