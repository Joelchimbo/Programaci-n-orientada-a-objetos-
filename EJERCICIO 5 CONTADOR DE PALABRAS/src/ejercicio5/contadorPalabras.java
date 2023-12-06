
package ejercicio5;

import java.util.Scanner;

public class contadorPalabras {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("BIENVENIDOS AL CONTADOR DE PALABRAS");

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        int numeroPalabras = contarPalabras(frase);
        System.out.println(" El numero de palabras en la frase es : " + numeroPalabras);

        scanner.close();
    }

    // Método para contar el número de palabras en una frase
    private static int contarPalabras(String frase) {
        String[] palabras = frase.split("\\s+");
        return palabras.length;
    }
}
