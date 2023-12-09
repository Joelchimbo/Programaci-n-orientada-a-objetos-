#include <iostream>

// Función para convertir Celsius a Fahrenheit
double celsiusaFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
}

// Función para convertir Fahrenheit a Celsius
double fahrenheitaCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
}

int main() {
    std::cout << "CONVERSOR DE TEMPERATURA C° A F° Y VICEVERSA" << std::endl;
    std::cout << "\n";

    double temperatura;
    std::cout << "Ingrese la temperatura: ";
    std::cin >> temperatura;

    char unidad;
    std::cout << "Ingrese la unidad de temperatura (C para Celsius, F para Fahrenheit): ";
    std::cin >> unidad;

    double resultado;

    switch (unidad) {
        case 'C':
        case 'c':
            resultado = celsiusaFahrenheit(temperatura);
            std::cout << "La temperatura en Fahrenheit es: " << resultado << std::endl;
            break;
        case 'F':
        case 'f':
            resultado = fahrenheitaCelsius(temperatura);
            std::cout << "La temperatura en Celsius es: " << resultado << std::endl;
            break;
        default:
            std::cout << "Valor no válido. Ingrese C o F." << std::endl;
    }

    return 0;
}

