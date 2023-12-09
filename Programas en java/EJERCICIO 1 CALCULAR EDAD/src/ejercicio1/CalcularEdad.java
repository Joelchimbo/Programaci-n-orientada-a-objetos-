
package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularEdad {
    
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA DE EDAD");
        do{
        try {
            //pide al usuario el año de su nacimiento
            System.out.println("Ingrese su anio de nacimiento:");
            int añoNacimiento = scanner.nextInt();
            
            //validacion de la entrada del año de nacimiento
            
            if (añoNacimiento <= 0 || añoNacimiento > 2023){
                System.out.println("ERROR!!!!! Ingrese un anio de nacimiento valido: ");
            }else {
                //realiza el calculo y guarda en la variable edad
                int edad = 2023 - añoNacimiento;
                
                //muestra la edad
                System.out.println("Su edad es: " + edad + " anios");
                
            }
            // manda el mensaje de la excepcion
        } catch (InputMismatchException e){
            System.out.println("ERROR!!!! Ingrese un anios valido...");
            scanner.nextLine();
        } 
     } while(true);
        }
}        
    

