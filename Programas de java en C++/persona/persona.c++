#include <iostream>
#include <string>

class Persona {
private:
    std::string nombre;
    double id;
    int edad;
    std::string sobrenombre;

public:
    // Constructor
    Persona(std::string nombre, double id, int edad, std::string sobrenombre)
        : nombre(nombre), id(id), edad(edad), sobrenombre(sobrenombre) {}

    // M�todos
    void hablar() {
        std::cout << this->nombre << " empez� a hablar" << std::endl;
    }

    void saludar() {
        std::cout << this->nombre << " empez� a saludar" << std::endl;
    }

    void jugar() {
        std::cout << this->nombre << " empez� a jugar" << std::endl;
    }
};

int main() {
    // Crear una instancia de la clase Persona
    Persona persona1("JOEL", 1753424363, 21, "OSO");

    // Llamar a los m�todos hablar, saludar y jugar
    persona1.hablar();
    persona1.saludar();
    persona1.jugar();

    return 0;
}

