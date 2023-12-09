#include <iostream>
#include <string>

class CuentaBancaria {
private:
    std::string numeroCuenta;
    double saldo;

public:
    // M�todo setter para el n�mero de cuenta
    void setNumeroCuenta(const std::string& numeroCuenta) {
        this->numeroCuenta = numeroCuenta;
    }

    // M�todo getter para el n�mero de cuenta
    std::string getNumeroCuenta() const {
        return numeroCuenta;
    }

    // M�todo setter para el saldo
    void setSaldo(double saldo) {
        this->saldo = saldo;
    }

    // M�todo getter para el saldo
    double getSaldo() const {
        return saldo;
    }

    // M�todo de acci�n para realizar un dep�sito
    void deposito(double cantidad) {
        saldo += cantidad;
        std::cout << "El dep�sito se realiz� con �xito..." << std::endl;
        std::cout << "Nuevo saldo: " << saldo << std::endl;
    }

    // M�todo de acci�n para realizar un retiro
    void retiro(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            std::cout << "El retiro se realiz� exitosamente..." << std::endl;
            std::cout << "Nuevo saldo: " << saldo << std::endl;
        } else {
            std::cout << "El saldo es insuficiente para realizar el retiro" << std::endl;
        }
    }
};

int main() {
    // Creamos la instancia de la cuenta bancaria
    CuentaBancaria cuenta;

    // Solicitamos al usuario el n�mero de cuenta
    std::cout << "INGRESE EL NUMERO DE CUENTA: ";
    std::string numeroCuenta;
    std::getline(std::cin, numeroCuenta);
    cuenta.setNumeroCuenta(numeroCuenta);

    // Solicitamos al usuario el saldo inicial
    std::cout << "INGRESE EL SALDO INICIAL: ";
    double saldoInicial;
    std::cin >> saldoInicial;
    cuenta.setSaldo(saldoInicial);

    // Solicitar cantidad de dep�sito
    std::cout << "Ingrese la cantidad a depositar: ";
    double cantidadDeposito;
    std::cin >> cantidadDeposito;
    cuenta.deposito(cantidadDeposito);

    // Solicitar cantidad de retiro
    std::cout << "Ingrese la cantidad a retirar: ";
    double cantidadRetiro;
    std::cin >> cantidadRetiro;
    cuenta.retiro(cantidadRetiro);

    // Mostrar informaci�n utilizando getters
    std::cout << "\nInformaci�n de la cuenta bancaria:" << std::endl;
    std::cout << "N�mero de cuenta: " << cuenta.getNumeroCuenta() << std::endl;
    std::cout << "Saldo actual: " << cuenta.getSaldo() << std::endl;

    return 0;
}

