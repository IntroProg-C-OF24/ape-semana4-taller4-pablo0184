import java.util.Scanner;
public class GastosHijos {
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
