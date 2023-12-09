#include <iostream>
#include <limits>

int main() {
    std::cout << "CALCULADORA DE EDAD" << std::endl;

    do {
        try {
            // Pide al usuario el a�o de su nacimiento
            std::cout << "Ingrese su a�o de nacimiento: ";
            int anioNacimiento;
            std::cin >> anioNacimiento;

            // Validaci�n de la entrada del a�o de nacimiento
            if (anioNacimiento <= 0 || anioNacimiento > 2023) {
                std::cout << "ERROR!!!!! Ingrese un a�o de nacimiento v�lido." << std::endl;
            } else {
                // Realiza el c�lculo y guarda en la variable edad
                int edad = 2023 - anioNacimiento;

                // Muestra la edad
                std::cout << "Su edad es: " << edad << " a�os" << std::endl;
                break; // Sale del bucle si la entrada es v�lida
            }
        } catch (...) {
            // Captura cualquier excepci�n no manejada
            std::cerr << "Error desconocido." << std::endl;
            break; // Sale del bucle en caso de error
        }

        // Limpia el buffer del cin despu�s de la entrada no v�lida
        std::cin.clear();
        std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

    } while (true);

    return 0;
}

