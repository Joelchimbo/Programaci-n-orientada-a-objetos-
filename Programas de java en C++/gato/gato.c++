#include <iostream>
#include <string>

class Gato {
public:
    // Atributos
    std::string nombre;
    std::string color;
    int edad;

    // Constructor
    Gato(std::string nombre, std::string color, int edad) : nombre(nombre), color(color), edad(edad) {}

    // Métodos
    void lamer() {
        std::cout << this->nombre << " Empezó a lamer" << std::endl;
    }

    void ronronear() {
        std::cout << this->nombre << " Empezó a ronronear" << std::endl;
    }
};

int main() {
    // Crear una instancia de la clase Gato
    Gato gato1("ARISTOTELES", "blanco", 2);

    // Llamar a los métodos lamer y ronronear
    gato1.lamer();
    gato1.ronronear();

    return 0;
}

