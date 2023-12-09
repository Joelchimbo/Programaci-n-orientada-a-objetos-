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

    // M�todos
    void lamer() {
        std::cout << this->nombre << " Empez� a lamer" << std::endl;
    }

    void ronronear() {
        std::cout << this->nombre << " Empez� a ronronear" << std::endl;
    }
};

int main() {
    // Crear una instancia de la clase Gato
    Gato gato1("ARISTOTELES", "blanco", 2);

    // Llamar a los m�todos lamer y ronronear
    gato1.lamer();
    gato1.ronronear();

    return 0;
}

