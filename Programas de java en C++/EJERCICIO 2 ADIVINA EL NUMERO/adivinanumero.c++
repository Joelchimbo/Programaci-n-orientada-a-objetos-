#include <iostream>
#include <cstdlib>
#include <ctime>

int main() {
    std::srand(std::time(0)); // Inicializar la semilla para generar n�meros aleatorios

    int rangoInicio = 1;
    int rangoFin = 100;
    int numeroAleatorio = std::rand() % (rangoFin - rangoInicio + 1) + rangoInicio;
    int intentos = 0;

    bool adivinado = false;

    std::cout << "ADIVINA EL N�MERO ENTRE " << rangoInicio << " Y " << rangoFin << std::endl;

    while (!adivinado) {
        std::cout << "Ingresa el n�mero: ";
        int numero;
        std::cin >> numero;
        intentos++;

        if (numero == numeroAleatorio) {
            adivinado = true;
            std::cout << "�FELICIDADES! ADIVINASTE EL N�MERO EN " << intentos << " INTENTOS" << std::endl;
        } else if (numero < numeroAleatorio) {
            std::cout << "EL N�MERO ES MAYOR... INTENTA CON OTRO N�MERO" << std::endl;
        } else {
            std::cout << "EL N�MERO ES MENOR... INTENTA CON OTRO N�MERO" << std::endl;
        }
    }

    return 0;
}

