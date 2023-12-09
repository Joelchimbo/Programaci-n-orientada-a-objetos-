
package ejercicio3;

import java.util.Scanner;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    
    //metodo setter para el numero de cuenta
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
   
    //metodo getter para ek numero de cuenta
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    
    
    //metodo setter para el saldo
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    //metodo getter para el saldo 
    public double getSaldo (){
        return saldo;
    }
    
    
    
    //Metodo accion para realizar un deposito
    public void deposito(double cantidad){
        saldo = saldo + cantidad;
        System.out.println("El deposito se realizo con exito...");
        System.out.println("Nuevo saldo: " + saldo);
    }
    
    
    //Metodo accion para realizar un retiro
    
    public void retiro(double cantidad){
        if(cantidad <= saldo){
            saldo = saldo - cantidad;
            System.out.println("El retiro se realizo exitosamente...");
            System.out.println("Nuevo saldo: "+ saldo);
        } else{
            System.out.println("El saldo es insuficiente para realizar el retiro");
        }
        
    }
    
    
    
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    
    //creamos la instancia de la cuenta bancaria
    
    CuentaBancaria cuenta = new CuentaBancaria();
    
    //solicitamos al usuario el numero de cuenta
        System.out.println("INGRESE EL NUMERO DE CUENTA: ");
        cuenta.setNumeroCuenta(scanner.nextLine());
        System.out.println("INGRESE EL SALDO INICIAL");
        cuenta.setSaldo(scanner.nextDouble());
         // Solicitar cantidad de depósito
        System.out.print("Ingrese la cantidad a depositar: ");
        double cantidadDeposito = scanner.nextDouble();
        cuenta.deposito(cantidadDeposito);

        // Solicitar cantidad de retiro
        System.out.print("Ingrese la cantidad a retirar: ");
        double cantidadRetiro = scanner.nextDouble();
        cuenta.retiro(cantidadRetiro);

        // Mostrar información utilizando getters
        System.out.println("\nInformación de la cuenta bancaria:");
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        scanner.close();
        
}
}
