/*
-Algoritmo08-
Se debe generar un algoritmo que permite calcular y mostrar el valor total a pagar mensual 
de servicios digitales de una persona. 
Los servicios digitales son: netflix, youtube premium, dropbox, spotify. 
Si la persona es menor a 30 años se descuenta el 20% del total mensual.
 */
package ejercicio08;
/**
 *
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner servicios = new Scanner(System.in);
        double valor1, valor2, valor3, valor4, valor5, valor6, valor7;
        System.out.println("Ingresa el costo de Netflix");
        valor1 = servicios.nextDouble();
        System.out.println("Ingresa el costo de Youtube Premium");
        valor2 = servicios.nextDouble();
        System.out.println("Ingresa el costo de Dropbox");
        valor3 = servicios.nextDouble();
        System.out.println("Ingresa el costo de Spotify");
        valor4 = servicios.nextDouble();
        System.out.println("Ingresa tu edad");
        valor6 = servicios.nextDouble();
        valor5 = valor1 + valor2 + valor3 + valor4;
        if (valor6 < 30) {
            valor7 = (valor5 * 30/100);
            valor5 = valor5 - valor7;
            System.out.println("El valor total a pagar es" + " " + valor5);
        }
        else {
            System.out.println("El valor total a pagar es" + " " + valor5);
        }
    }   
}        
 