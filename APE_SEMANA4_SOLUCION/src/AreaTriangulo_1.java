/*
Algoritmo_1
Generar un algoritmo que permite calcular y presentar el area de un triangulo,
Los datos deben ser pedidios al usuario
*/
import java.util.Scanner;
public class AreaTriangulo_1 {
 
    public static void main (String[]arg){
    double baseTriangulo;
    double alturaTriangulo;
    double areaTriangulo;
    Scanner teclado = new Scanner(System.in); //Declarado E INICIALIZAR
    System.out.println("Ingrese la base del triangulo: ");
    baseTriangulo = teclado.nextDouble();
    System.out.println("Igrese la altura del triangulo: ");
    alturaTriangulo = teclado.nextDouble();
    areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
    System.out.println("El area del triangulo es: " + areaTriangulo);
            
        
    }
    
}
