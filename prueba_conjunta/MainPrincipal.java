package prueba_conjunta;

import java.util.Scanner;

public class MainPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char respuesta;
        do {
            try {
                // LIBRO DE FICCION
                System.out.println("LIBRO DE FICCION");
                String nombreLibroFiccion = obtenerEntradaValida("Ingrese el nombre del libro de ficción: ", "[a-zA-Z ]+", "ERROR: El nombre del libro solo puede contener letras y espacios");

                String nombreAutor = obtenerEntradaValida("Ingrese el nombre del autor: ", "[a-zA-Z ]+", "ERROR: El nombre del autor solo puede contener letras y espacios");

                int anioPublicacion = obtenerEnteroPositivo("Ingrese el año de publicación: ", "ERROR: El año de publicación no puede ser negativo");

                String genero = obtenerEntradaValida("Ingrese el género: ", "[a-zA-Z ]+", "ERROR: El género solo puede contener letras y espacios");

                LibroFiccion libroFiccion = new LibroFiccion(nombreLibroFiccion, nombreAutor, anioPublicacion, genero);

                // Mostrar información y calcular edad
                System.out.println("\nInformación del Libro de Ficción:");
                libroFiccion.mostrar_información();
                libroFiccion.calcular_edad();
                System.out.println("Género: " + libroFiccion.genero);

                // LIBRO NO FICCION
                System.out.println("\nLIBRO DE NO FICCION");
                String nombreLibroNoFiccion = obtenerEntradaValida("Ingrese el nombre del libro de no ficción: ", "[a-zA-Z ]+", "ERROR: El nombre del libro solo puede contener letras y espacios");

                String nombreAutorNoFiccion = obtenerEntradaValida("Ingrese el nombre del autor: ", "[a-zA-Z ]+", "ERROR: El nombre del autor solo puede contener letras y espacios");

                String temaNoFiccion = obtenerEntradaValida("Ingrese el tema: ", "[a-zA-Z ]+", "ERROR: El tema solo puede contener letras y espacios");

                LibroNoFiccion libroNoFiccion = new LibroNoFiccion(nombreLibroNoFiccion, nombreAutorNoFiccion, temaNoFiccion);

                int anioPublicacionNoFiccion = obtenerEnteroPositivo("Ingrese el año de publicación: ", "ERROR: El año de publicación no puede ser negativo");

                libroNoFiccion.setanio_publicacion(anioPublicacionNoFiccion);

                // Mostrar información y calcular edad
                System.out.println("\nInformación del Libro de No Ficción:");
                libroNoFiccion.mostrar_información();
                libroNoFiccion.calcular_edad();
                System.out.println("Tema: " + libroNoFiccion.tema);

                // Preguntar si quiere ingresar otro libro
                System.out.println("\n¿Desea ingresar otro libro? (s/n): ");
                respuesta = scanner.nextLine().charAt(0);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                respuesta = 's'; // Forzar a volver a intentar si hay un error
            }
        } while (respuesta == 's' || respuesta == 'S');
    }

    private static String obtenerEntradaValida(String mensaje, String patron, String mensajeError) {
        Scanner scanner = new Scanner(System.in);
        String entrada;
        do {
            System.out.println(mensaje);
            entrada = scanner.nextLine();
        } while (!entrada.matches(patron));
        return entrada;
    }

    private static int obtenerEnteroPositivo(String mensaje, String mensajeError) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println(mensaje);
            while (!scanner.hasNextInt()) {
                System.out.println(mensajeError);
                System.out.println(mensaje);
                scanner.next(); // consume the invalid input
            }
            numero = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
        } while (numero < 0);
        return numero;
    }
}
