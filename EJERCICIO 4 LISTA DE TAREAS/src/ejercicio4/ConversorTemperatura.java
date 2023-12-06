
package ejercicio4;
import java.util.Scanner;

public class ConversorTemperatura {
    
    // Método para convertir Celsius a Fahrenheit
    private static double celsiusaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método para convertir Fahrenheit a Celsius
    private static double fahrenheitaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CONVERSOR DE TEMPERATURA C° A F° Y VICEVERSA");
        System.out.println("\n");
        System.out.print("Ingrese la temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Ingrese la unidad de temperatura (C para Celsius, F para Fahrenheit): ");
        char unidad = scanner.next().charAt(0);

        double resultado;

        switch (unidad) {
            case 'C':
            case 'c':
                resultado = celsiusaFahrenheit(temperatura);
                System.out.println("La temperatura en Fahrenheit es: " + resultado);
                break;
            case 'F':
            case 'f':
                resultado = fahrenheitaCelsius(temperatura);
                System.out.println("La temperatura en Celsius es: " + resultado);
                break;
            default:
                System.out.println("valor no volida. Ingrese C o F.");
        }

        scanner.close();
    }


}
