#include <iostream>
#include <sstream>

// Funci�n para contar el n�mero de palabras en una frase
int contarPalabras(const std::string& frase) {
    std::istringstream stream(frase);
    int contador = 0;
    std::string palabra;

    while (stream >> palabra) {
        contador++;
    }

    return contador;
}

int main() {
    std::cout << "BIENVENIDOS AL CONTADOR DE PALABRAS" << std::endl;

    std::cout << "Ingrese una frase: ";
    std::string frase;
    std::getline(std::cin, frase);

    int numeroPalabras = contarPalabras(frase);
    std::cout << "El n�mero de palabras en la frase es: " << numeroPalabras << std::endl;

    return 0;
}

