package pre_prueba;

import java.util.Scanner;

public class MainPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean datosCorrectos = false;
        do {
            try {
                System.out.println("Ingrese el nombre del empleado: ");
                String nombre = scanner.nextLine();
                if (!nombre.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("ERROR: El nombre solo puede contener letras");
                }
                System.out.println("Ingrese el apellido del empleado: ");
                String apellido = scanner.nextLine();
                if (!apellido.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("ERROR: El apellido solo puede contener letras");
                }
                System.out.println("Ingrese el salario del empleado: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();
                if (salario < 0) {
                    throw new IllegalArgumentException("ERROR: El salario no puede ser negativo");
                }
                System.out.println("Ingrese la edad del empleado: ");
                int edad = scanner.nextInt();
                if (edad < 0) {
                    throw new IllegalArgumentException("ERROR: La edad no puede ser negativa");
                }
                System.out.println("Ingrese el lenguaje que utiliza el empleado: ");
                String lenguaje = scanner.nextLine();

                Desarrollador desarrollador = new Desarrollador(nombre, apellido, edad, salario, lenguaje);
                desarrollador.setSalario(salario);
                desarrollador.mostrar_información();
                System.out.println("\n");
                System.out.println("El bono del desarrollador sera de: " + desarrollador.bono());
                System.out.println("\n");

                datosCorrectos = true;

            } catch (NumberFormatException e) {
                System.out.println("Error, ingrese un numero valido para la edad");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!datosCorrectos);
        datosCorrectos = false;
        System.out.println("Se registro el Desarrollador");

        do {
            try {
                System.out.println("\nIngrese el nombre del empleado: ");
                String nombre = scanner.nextLine();
                if (!nombre.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("ERROR: El nombre solo puede contener letras");
                }

                System.out.println("Ingrese el apellido del empleado: ");
                String apellido = scanner.nextLine();
                if (!apellido.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("ERROR: El apellido solo puede contener letras");
                }
                System.out.println("Ingrese el salario del empleado: ");
                double salario = scanner.nextDouble();
                if (salario < 0) {
                    throw new IllegalArgumentException("ERROR: El salario no puede ser negativo");
                }
                System.out.println("Ingrese la edad del empleado: ");
                int edad = scanner.nextInt();
                scanner.nextLine();
                if (edad < 0) {
                    throw new IllegalArgumentException("ERROR: La edad no puede ser negativa");
                }
                System.out.println("Ingrese el departamento en el que trabaja el empleado: ");
                String departamento = scanner.nextLine();

                Gerente gerente = new Gerente(nombre, apellido, edad, salario, departamento);
                gerente.setSalario(salario);
                gerente.mostrar_información();
                System.out.println("\n");
                System.out.println("El bono del gerente sera de: " + gerente.bono());
                System.out.println("\n");

                datosCorrectos = true;

            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero valido para la edad");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!datosCorrectos);
        datosCorrectos = false;
        System.out.println("Se registro el Gerente");

        scanner.close();
    }
}