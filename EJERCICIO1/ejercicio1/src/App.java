import java.util.Scanner;
import ejercicio.Comparaciones;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("EJERCICIO 1 - PROGRAMACIÓN");
        System.out.print("Introduzca un numero: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduzca un segundo numero: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduzca un tercer numero: ");
        int num3 = Integer.parseInt(scanner.nextLine());


        System.out.printf("El numero mas grande entre estos 3 es: %d", Comparaciones.masgrande(num1, num2, num3));
        
        
        try {
            int num1 = Comparaciones.leerValorEntero("INTRODUCE UN NUMERO: ");
            int num2 = Comparaciones.leerValorEntero("INTRODUCE OTRO NUMERO: ");
            int num3 = Comparaciones.leerValorEntero("INTRODUCE OTRO NUMERO MAS: ");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }


        scanner.close();
    }
}
