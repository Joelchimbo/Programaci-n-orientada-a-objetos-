
package ejercicio2;
import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();
        
        int rangoInicio =1;
        int rangoFin =100;
        int numeroAleatorio = random.nextInt(rangoFin - rangoInicio + 1) + rangoInicio;
        int intentos = 0;
        
        boolean adivinado = false;
        
        System.out.println("ADIVINA EL NUMERO ENTRE " + rangoInicio + " Y " + rangoFin + "");
        
        while(!adivinado){
            System.out.println("Ingresa el numero:");
            int numero = scanner.nextInt();
            intentos ++;
            
            if (numero == numeroAleatorio){
                adivinado = true;
                System.out.println("FELICIDADES.... ADIVINASTE EL NUMERO EN " + intentos + " INTENTOS");
            }else if (numero < numeroAleatorio){
                System.out.println("EL NUMERO ES MAYOR... INTENTA CON OTRO NUMERO");
            }else {
                System.out.println("EL NUMERO ES MENOR.... INTENTA CON OTRO NUMERO");
            }
        }
        scanner.close();
    }
}
