#include <iostream>
#include <limits>

int main() {
    std::cout << "CALCULADORA DE EDAD" << std::endl;

    do {
        try {
            // Pide al usuario el año de su nacimiento
            std::cout << "Ingrese su año de nacimiento: ";
            int anioNacimiento;
            std::cin >> anioNacimiento;

            // Validación de la entrada del año de nacimiento
            if (anioNacimiento <= 0 || anioNacimiento > 2023) {
                std::cout << "ERROR!!!!! Ingrese un año de nacimiento válido." << std::endl;
            } else {
                // Realiza el cálculo y guarda en la variable edad
                int edad = 2023 - anioNacimiento;

                // Muestra la edad
                std::cout << "Su edad es: " << edad << " años" << std::endl;
                break; // Sale del bucle si la entrada es válida
            }
        } catch (...) {
            // Captura cualquier excepción no manejada
            std::cerr << "Error desconocido." << std::endl;
            break; // Sale del bucle en caso de error
        }

        // Limpia el buffer del cin después de la entrada no válida
        std::cin.clear();
        std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

    } while (true);

    return 0;
}

