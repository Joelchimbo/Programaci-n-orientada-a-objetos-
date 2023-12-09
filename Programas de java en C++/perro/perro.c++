#include <iostream>
#include <string>

class Perro {
public:
    // Atributos
    std::string nombre;
    std::string color;
    int edad;

    // Constructor
    Perro(std::string nombre, std::string color, int edad) : nombre(nombre), color(color), edad(edad) {}

    // Métodos
    void correr() {
        std::cout << this->nombre << " Empezó a correr" << std::endl;
    }

    void ladrar() {
        std::cout << this->nombre << " Empezó a ladrar" << std::endl;
    }

    void morder() {
        std::cout << this->nombre << " Empezó a morder" << std::endl;
    }
};

int main() {
    // Crear una instancia de la clase Perro
    Perro perro1("MAX", "café", 4);

    // Llamar a los métodos correr, ladrar y morder
    perro1.correr();
    perro1.ladrar();
    perro1.morder();

    return 0;
}

