#include <iostream>
#include <cmath>

double calcularAreaCuadrado();
double calcularAreaCirculo();
double calcularAreaTriangulo();

int main() {
    std::cout << "CALCULADORA DE AREAS" << std::endl;
    std::cout << "INGRESE EL NOMBRE DE LA FIGURA A CALCULAR EL AREA (CUADRADO, CIRCULO, TRIANGULO) " << std::endl;

    std::string nombreFigura;
    std::cin >> nombreFigura;

    double area = 0.0;

    if (nombreFigura == "cuadrado") {
        area = calcularAreaCuadrado();
    } else if (nombreFigura == "circulo") {
        area = calcularAreaCirculo();
    } else if (nombreFigura == "triangulo") {
        area = calcularAreaTriangulo();
    } else {
        std::cout << "Figura no reconocida. Por favor, ingresa cuadrado, circulo o triangulo." << std::endl;
        return 1;
    }

    std::cout << "El area de la " << nombreFigura << " es: " << area << std::endl;

    return 0;
}

double calcularAreaCuadrado() {
    std::cout << "Ingresa el lado del cuadrado: " << std::endl;
    double lado;
    std::cin >> lado;

    return lado * lado;
}

double calcularAreaCirculo() {
    std::cout << "Ingresa el radio del circulo: " << std::endl;
    double radio;
    std::cin >> radio;

    return M_PI * std::pow(radio, 2);
}

double calcularAreaTriangulo() {
    std::cout << "Ingresa la base del triangulo: " << std::endl;
    double base;
    std::cin >> base;

    std::cout << "Ingresa la altura del triangulo: " << std::endl;
    double altura;
    std::cin >> altura;

    return (base * altura) / 2;
}

