#include <iostream>
#include <limits>

int mostrarMenu() {
    int opcionSeleccionada;

    std::cout << " CALCULADORA OPERACIONES " << std::endl;
    std::cout << "Seleccione la operacion que desea realizar" << std::endl;
    std::cout << "1. SUMA" << std::endl;
    std::cout << "2. RESTA" << std::endl;
    std::cout << "3. MULTIPLICACION" << std::endl;
    std::cout << "4. DIVISION" << std::endl;
    std::cout << "5. SALIR" << std::endl;

    while (true) {
        std::cout << "Ingrese el numero de la opcion: ";
        if (std::cin >> opcionSeleccionada) {
            return opcionSeleccionada;
        } else {
            std::cout << "ERROR: Ingrese un numero valido." << std::endl;
            std::cin.clear();
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
        }
    }
}

int obtenerNumero(const std::string& mensaje) {
    int numero;

    while (true) {
        std::cout << mensaje;
        if (std::cin >> numero) {
            return numero;
        } else {
            std::cout << "ERROR: Ingrese un numero valido." << std::endl;
            std::cin.clear();
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
        }
    }
}

void mostrarResultado(const std::string& operacion, int resultado) {
    std::cout << "El resultado de la " << operacion << " es: " << resultado << std::endl;
}

int suma() {
    int num1 = obtenerNumero("INGRESE EL PRIMER NUMERO: ");
    int num2 = obtenerNumero("INGRESE EL SEGUNDO NUMERO: ");
    return num1 + num2;
}

int resta() {
    int num1 = obtenerNumero("INGRESE EL PRIMER NUMERO: ");
    int num2 = obtenerNumero("INGRESE EL SEGUNDO NUMERO: ");
    return num1 - num2;
}

int multiplicacion() {
    int num1 = obtenerNumero("INGRESE EL PRIMER NUMERO: ");
    int num2 = obtenerNumero("INGRESE EL SEGUNDO NUMERO: ");
    return num1 * num2;
}

int division() {
    int num1 = obtenerNumero("INGRESE EL PRIMER NUMERO: ");
    int num2;

    while (true) {
        num2 = obtenerNumero("INGRESE EL SEGUNDO NUMERO: ");
        if (num2 != 0) {
            break;
        } else {
            std::cout << "ERROR: La division por cero no esta permitida. Ingrese un divisor diferente de cero." << std::endl;
        }
    }

    return num1 / num2;
}

int main() {
    int resultado = 0;

    do {
        int opcionSeleccionada = mostrarMenu();

        switch (opcionSeleccionada) {
            case 1:
                resultado = suma();
                mostrarResultado("SUMA", resultado);
                break;
            case 2:
                resultado = resta();
                mostrarResultado("RESTA", resultado);
                break;
            case 3:
                resultado = multiplicacion();
                mostrarResultado("MULTIPLICACION", resultado);
                break;
            case 4:
                resultado = division();
                mostrarResultado("DIVISION", resultado);
                break;
            case 5:
                std::cout << "Saliendo de la calculadora. Hasta luego" << std::endl;
                return 0;
            default:
                std::cout << "ERROR!!! Seleccione una opcion valida" << std::endl;
        }

    } while (true);

    return 0;
}

