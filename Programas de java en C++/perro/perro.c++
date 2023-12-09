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

    // M�todos
    void correr() {
        std::cout << this->nombre << " Empez� a correr" << std::endl;
    }

    void ladrar() {
        std::cout << this->nombre << " Empez� a ladrar" << std::endl;
    }

    void morder() {
        std::cout << this->nombre << " Empez� a morder" << std::endl;
    }
};

int main() {
    // Crear una instancia de la clase Perro
    Perro perro1("MAX", "caf�", 4);

    // Llamar a los m�todos correr, ladrar y morder
    perro1.correr();
    perro1.ladrar();
    perro1.morder();

    return 0;
}

