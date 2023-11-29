
package calculadoradeareas;

import java.util.Scanner;

public class Calculadoradeareas {


    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       
        System.out.println("CALCULADORA DE AREAS");
        System.out.println("INGRESE EL NOMBRE DE LA FIGURA A CALCULAR EL AREA (CUADRADO,CIRCULO,TRIANGULO) ");
        String nombreFigura=scanner.nextLine().toLowerCase();
        
        double area= 0.0;
        
        switch (nombreFigura) {
            case "cuadrado":
                area = calcularAreaCuadrado();
                break;
            case "circulo":
                area = calcularAreaCirculo();
                break;
            case "triangulo":
                area = calcularAreaTriangulo();
                break;
            default:
                System.out.println("Figura no reconocida. Por favor, ingresa cuadrado, circulo o triangulo.");
                System.exit(1);
        
    }
    System.out.println("El area de la " + nombreFigura + " es: " + area);
}
    
private static double calcularAreaCuadrado() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        return lado * lado;
    }
private static double calcularAreaCirculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el radio del circulo: ");
        double radio = scanner.nextDouble();

        return Math.PI * Math.pow(radio, 2);
    }

    private static double calcularAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la base del triangulo: ");
        double base = scanner.nextDouble();

        System.out.println("Ingresa la altura del triangulo: ");
        double altura = scanner.nextDouble();

        return (base * altura) / 2;
    }
    
}