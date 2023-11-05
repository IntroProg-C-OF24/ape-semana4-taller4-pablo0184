/*
-Algoritmo03-
Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar de un número 
ingresado por el usuario; 
Solo en el caso que el valor del número esté entre 2 y 6.
 */
package ejercicio03;
/**
 * @autor: Pablo 
 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner TablaDeMultiplicar = new Scanner(System.in);
        int valor1;
        double valor2;
        System.out.println("Dame el numero");
        valor1 = TablaDeMultiplicar.nextInt();
        if (valor1>=2 && valor1<=6){
            valor2 = valor1*1;
            System.out.println(valor1 + "x 1 = " + valor2);
            valor2 = valor1*2;
            System.out.println(valor1 + "x 2 = " + valor2);
            valor2 = valor1*3;
            System.out.println(valor1 + "x 3 = " + valor2);
            valor2 = valor1*4;
            System.out.println(valor1 + "x 4 = " + valor2);
            valor2 = valor1*5;
            System.out.println(valor1 + "x 5 = " + valor2);
            valor2 = valor1*6;
            System.out.println(valor1 + "x 6 = " + valor2);
            valor2 = valor1*7;
            System.out.println(valor1 + "x 7 = " + valor2);
            valor2 = valor1*8;
            System.out.println(valor1 + "x 8 = " + valor2);
            valor2 = valor1*9;
            System.out.println(valor1 + "x 9 = " + valor2);
            valor2 = valor1*10;
            System.out.println(valor1 + "x 10 = " + valor2);
            valor2 = valor1*11;
            System.out.println(valor1 + "x 11 = " + valor2);
            valor2 = valor1*12;
            System.out.println(valor1 + "x 12 = " + valor2);
        }
        else {
            System.out.println("numero incorrecto brou");
        }
    }   
}