/*
-Algoritmo09-
El programa debe calcular el área del polígono. 
La figura se compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, E), 
cuya base mide lo mismo que uno de los lados del cuadrado, y un rectángulo cuyo ancho mide lo mismo 
que uno de los lados del cuadrado mientras que la altura mide lo mismo que la altura de los triángulos. 
Se pide que haga un programa que calcule el área total.

Por cultura general, sabemos que el área de un rectángulo se calcula multiplicando su base por su altura; 
El área de un triángulo rectángulo se calcula multiplicando su base por su altura
y luego dividiendo el resultado entre dos; 
Finalmente, el área de un cuadrado se calcula elevando al cuadrado la medida de uno de sus lados.

La parte interesante de este problema es determinar el mínimo número de datos que hay que preguntar.
 */
package ejercicio09;

/**
 *
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner figura = new Scanner(System.in);
        double valor1, valor2, valor3, valor4, valor5;
        System.out.println("Ingresa el valor de un lado del cuadrado");
        valor1 = figura.nextDouble();
        System.out.println("Ingresa el valor de la altura del triangulo");
        valor2 = figura.nextDouble();
        valor3 = ((valor1*valor2)/2)*5;
        valor4 = valor1*valor1;
        valor5 = valor3 + valor4;
        System.out.println("El area del poligono es:" + " " + valor5);
        // TODO code application logic here
    }
    
}
