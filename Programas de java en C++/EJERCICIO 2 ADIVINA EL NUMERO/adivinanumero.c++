#include <iostream>
#include <cstdlib>
#include <ctime>

int main() {
    std::srand(std::time(0)); // Inicializar la semilla para generar números aleatorios

    int rangoInicio = 1;
    int rangoFin = 100;
    int numeroAleatorio = std::rand() % (rangoFin - rangoInicio + 1) + rangoInicio;
    int intentos = 0;

    bool adivinado = false;

    std::cout << "ADIVINA EL NÚMERO ENTRE " << rangoInicio << " Y " << rangoFin << std::endl;

    while (!adivinado) {
        std::cout << "Ingresa el número: ";
        int numero;
        std::cin >> numero;
        intentos++;

        if (numero == numeroAleatorio) {
            adivinado = true;
            std::cout << "¡FELICIDADES! ADIVINASTE EL NÚMERO EN " << intentos << " INTENTOS" << std::endl;
        } else if (numero < numeroAleatorio) {
            std::cout << "EL NÚMERO ES MAYOR... INTENTA CON OTRO NÚMERO" << std::endl;
        } else {
            std::cout << "EL NÚMERO ES MENOR... INTENTA CON OTRO NÚMERO" << std::endl;
        }
    }

    return 0;
}

