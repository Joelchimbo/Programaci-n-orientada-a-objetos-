import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraExcepciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;

        do {
            System.out.println(" CALCULADORA OPERACIONES ");
            System.out.println("Seleccione la operacion que desea realizar");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACION");
            System.out.println("4. DIVISION");
            System.out.println("5. SALIR");

            int opcionSeleccionada = obtenerOpcion(scanner);

            switch (opcionSeleccionada) {
                case 1:
                    resultado = suma(scanner);
                    mostrarResultado("SUMA", resultado);
                    break;
                case 2:
                    resultado = resta(scanner);
                    mostrarResultado("RESTA", resultado);
                    break;
                case 3:
                    resultado = multiplicacion(scanner);
                    mostrarResultado("MULTIPLICACION", resultado);
                    break;
                case 4:
                    resultado = division(scanner);
                    mostrarResultado("DIVISION", resultado);
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora. Hasta luego");
                    scanner.close();
                    return;
                default:
                    System.out.println("ERROR!!! Seleccione una opcion valida");
            }

        } while (true);
    }

    public static void mostrarResultado(String operacion, int resultado) {
        System.out.println("El resultado de la " + operacion + " es: " + resultado);
    }
 // Método para obtener la opción del usuario con manejo de excepciones
    public static int obtenerOpcion(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Ingrese el numero de la opcion: ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Limpiar el buffer del scanner
                System.out.println("ERROR: Ingrese un numero valido.");
            }
        }
    }
 // Método para obtener un número del usuario con manejo de excepciones
    public static int obtenerNumero(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Limpiar el buffer del scanner
                System.out.println("ERROR: Ingrese un numero valido.");
            }
        }
    }

    public static int suma(Scanner scanner) {
        int num1 = obtenerNumero(scanner, "INGRESE EL PRIMER NUMERO");
        int num2 = obtenerNumero(scanner, "INGRESE EL SEGUNDO NUMERO");
        return num1 + num2;
    }

    public static int resta(Scanner scanner) {
        int num1 = obtenerNumero(scanner, "INGRESE EL PRIMER NUMERO");
        int num2 = obtenerNumero(scanner, "INGRESE EL SEGUNDO NUMERO");
        return num1 - num2;
    }

    public static int multiplicacion(Scanner scanner) {
        int num1 = obtenerNumero(scanner, "INGRESE EL PRIMER NUMERO");
        int num2 = obtenerNumero(scanner, "INGRESE EL SEGUNDO NUMERO");
        return num1 * num2;
    }
// Método para la operación de división con manejo de excepciones
    public static int division(Scanner scanner) {
        int num1 = obtenerNumero(scanner, "INGRESE EL PRIMER NUMERO");
        int num2;
        while (true) {
            num2 = obtenerNumero(scanner, "INGRESE EL SEGUNDO NUMERO");
            if (num2 != 0) {
                break;
            } else {
                System.out.println("ERROR: La division por cero no esta permitida. Ingrese un divisor diferente de cero.");
            }
        }

        return num1 / num2;
    }
}
