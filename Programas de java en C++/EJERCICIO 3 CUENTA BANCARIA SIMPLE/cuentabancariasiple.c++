#include <iostream>
#include <string>

class CuentaBancaria {
private:
    std::string numeroCuenta;
    double saldo;

public:
    // Método setter para el número de cuenta
    void setNumeroCuenta(const std::string& numeroCuenta) {
        this->numeroCuenta = numeroCuenta;
    }

    // Método getter para el número de cuenta
    std::string getNumeroCuenta() const {
        return numeroCuenta;
    }

    // Método setter para el saldo
    void setSaldo(double saldo) {
        this->saldo = saldo;
    }

    // Método getter para el saldo
    double getSaldo() const {
        return saldo;
    }

    // Método de acción para realizar un depósito
    void deposito(double cantidad) {
        saldo += cantidad;
        std::cout << "El depósito se realizó con éxito..." << std::endl;
        std::cout << "Nuevo saldo: " << saldo << std::endl;
    }

    // Método de acción para realizar un retiro
    void retiro(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            std::cout << "El retiro se realizó exitosamente..." << std::endl;
            std::cout << "Nuevo saldo: " << saldo << std::endl;
        } else {
            std::cout << "El saldo es insuficiente para realizar el retiro" << std::endl;
        }
    }
};

int main() {
    // Creamos la instancia de la cuenta bancaria
    CuentaBancaria cuenta;

    // Solicitamos al usuario el número de cuenta
    std::cout << "INGRESE EL NUMERO DE CUENTA: ";
    std::string numeroCuenta;
    std::getline(std::cin, numeroCuenta);
    cuenta.setNumeroCuenta(numeroCuenta);

    // Solicitamos al usuario el saldo inicial
    std::cout << "INGRESE EL SALDO INICIAL: ";
    double saldoInicial;
    std::cin >> saldoInicial;
    cuenta.setSaldo(saldoInicial);

    // Solicitar cantidad de depósito
    std::cout << "Ingrese la cantidad a depositar: ";
    double cantidadDeposito;
    std::cin >> cantidadDeposito;
    cuenta.deposito(cantidadDeposito);

    // Solicitar cantidad de retiro
    std::cout << "Ingrese la cantidad a retirar: ";
    double cantidadRetiro;
    std::cin >> cantidadRetiro;
    cuenta.retiro(cantidadRetiro);

    // Mostrar información utilizando getters
    std::cout << "\nInformación de la cuenta bancaria:" << std::endl;
    std::cout << "Número de cuenta: " << cuenta.getNumeroCuenta() << std::endl;
    std::cout << "Saldo actual: " << cuenta.getSaldo() << std::endl;

    return 0;
}

