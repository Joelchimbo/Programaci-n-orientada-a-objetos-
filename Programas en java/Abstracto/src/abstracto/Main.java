
package abstracto;
import java.util.InputMismatchException;
import java.util.Scanner;

class Persona {
    public String nombre;
    public int edad;
    public double cedula;

    public Persona(String nombre, int edad, double cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }
}

class Visitante extends Persona {
    private String numCarnet;

    public Visitante(String nombre, int edad, double cedula, String numCarnet) {
        super(nombre, edad, cedula);
        this.numCarnet = numCarnet;
    }

    public void comprar() {
        System.out.println(nombre + " con cédula " + cedula + " y número de carnet " + numCarnet + " está comprando boletos.");
    }
}

class Cuidador extends Persona {
    private String numId;

    public Cuidador(String nombre, int edad, double cedula, String numId) {
        super(nombre, edad, cedula);
        this.numId = numId;
    }

    public void alimentarAnimales() {
        System.out.println("El cuidador " + nombre + " con cédula " + cedula + " y número de identificación " + numId + " está alimentando animales.");
    }
}

class Zoo {
    private String nombre;
    private String numRegistro;

    public Zoo(String nombre, String numRegistro) {
        this.nombre = nombre;
        this.numRegistro = numRegistro;
    }

    public void mostrarInformacion() {
        System.out.println("Zoo: " + nombre + ", Número de Registro: " + numRegistro);
    }
}

class Leon {
    private String nombre;
    private String vacuna;
    private double cantidadVacuna;

    public Leon(String nombre, String vacuna, double cantidadVacuna) {
        this.nombre = nombre;
        this.vacuna = vacuna;
        this.cantidadVacuna = cantidadVacuna;
    }

    public void rugir() {
        System.out.println("El león " + nombre + " está rugiendo.");
    }

    public void cazar() {
        System.out.println("El león " + nombre + " está cazando.");
    }
}

class Pinguino {
    private String nombre;
    private String vacuna;
    private double cantidadVacuna;

    public Pinguino(String nombre, String vacuna, double cantidadVacuna) {
        this.nombre = nombre;
        this.vacuna = vacuna;
        this.cantidadVacuna = cantidadVacuna;
    }

    public void nadar() {
        System.out.println("El pingüino " + nombre + " está nadando.");
    }

    public void pescar() {
        System.out.println("El pingüino " + nombre + " está pescando.");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            try {
                // Ingreso de datos del zoológico
                System.out.println("Ingrese el nombre del zoo:");
                String nombreZoo = validarTexto(scanner);

                System.out.println("Ingrese el número de registro del zoo:");
                String numRegistroZoo = validarTexto(scanner);

                // Creación del objeto zoo
                Zoo zoo = new Zoo(nombreZoo, numRegistroZoo);
                zoo.mostrarInformacion();

                // Ingreso de datos del visitante
                System.out.println("Ingrese el nombre del visitante:");
                String nombreVisitante = validarTexto(scanner);

                System.out.println("Ingrese la edad del visitante:");
                int edadVisitante = validarEntero(scanner, 1, 150); // Edad entre 1 y 150 años

                System.out.println("Ingrese la cédula del visitante:");
                double cedulaVisitante = validarDouble(scanner);

                System.out.println("Ingrese el número de carnet del visitante:");
                String numCarnetVisitante = validarTexto(scanner);

                // Creación del objeto visitante
                Visitante visitante = new Visitante(nombreVisitante, edadVisitante, cedulaVisitante, numCarnetVisitante);
                visitante.comprar();

                // Ingreso de datos del cuidador
                System.out.println("Ingrese el nombre del cuidador:");
                String nombreCuidador = validarTexto(scanner);

                System.out.println("Ingrese la edad del cuidador:");
                int edadCuidador = validarEntero(scanner, 1, 150); // Edad entre 1 y 150 años

                System.out.println("Ingrese la cédula del cuidador:");
                double cedulaCuidador = validarDouble(scanner);

                System.out.println("Ingrese el número de identificación del cuidador:");
                String numIdCuidador = validarTexto(scanner);

                // Creación del objeto cuidador
                Cuidador cuidador = new Cuidador(nombreCuidador, edadCuidador, cedulaCuidador, numIdCuidador);
                cuidador.alimentarAnimales();

                // Ingreso de datos y creación de objeto León
                System.out.println("Ingrese el nombre del león:");
                String nombreLeon = validarTexto(scanner);

                System.out.println("Ingrese la vacuna del león:");
                String vacunaLeon = validarTexto(scanner);

                System.out.println("Ingrese la cantidad de vacuna del león:");
                double cantidadVacunaLeon = validarDouble(scanner);

                Leon leon = new Leon(nombreLeon, vacunaLeon, cantidadVacunaLeon);
                leon.rugir();
                leon.cazar();

                // Ingreso de datos y creación de objeto Pinguino
                System.out.println("Ingrese el nombre del pingüino:");
                String nombrePinguino = validarTexto(scanner);

                System.out.println("Ingrese la vacuna del pingüino:");
                String vacunaPinguino = validarTexto(scanner);

                System.out.println("Ingrese la cantidad de vacuna del pingüino:");
                double cantidadVacunaPinguino = validarDouble(scanner);

                Pinguino pinguino = new Pinguino(nombrePinguino, vacunaPinguino, cantidadVacunaPinguino);
                pinguino.nadar();
                pinguino.pescar();

                System.out.println("¿Desea continuar? (S/N): ");
                String respuesta = scanner.nextLine().toUpperCase();
                continuar = respuesta.equals("S");

            } catch (NumberFormatException e) {
                System.out.println("Error al parsear a número, ingrese datos válidos");
            } catch (InputMismatchException e) {
                System.out.println("Error de entrada. Asegúrese de ingresar el tipo correcto de datos.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static int validarEntero(Scanner scanner, int min, int max) {
        while (true) {
            try {
                int valor = Integer.parseInt(scanner.nextLine());
                if (valor >= min && valor <= max) {
                    return valor;
                } else {
                    System.out.println("Ingrese un número entero válido entre " + min + " y " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número entero válido.");
            }
        }
    }

    private static double validarDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido.");
            }
        }
    }

    private static String validarTexto(Scanner scanner) {
        while (true) {
            String valor = scanner.nextLine().trim();
            if (!valor.isEmpty()) {
                return valor;
            } else {
                System.out.println("Ingrese un valor válido.");
            }
        }
    }
}
