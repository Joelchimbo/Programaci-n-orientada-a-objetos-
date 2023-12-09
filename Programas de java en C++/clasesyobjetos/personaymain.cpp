#include <iostream>
#include <string>

class Persona {
    // Atributos
    std::string nombre;
    int edad;

public:
    // Constructor
    Persona(std::string nombre, int edad) : nombre(nombre), edad(edad) {}

    // Métodos
    void mostrarDatos() {
        std::cout << "El nombre es: " << nombre << std::endl;
        std::cout << "La edad es: " << edad << std::endl;
    }
};

int main() {
    // Crear una instancia de la clase Persona
    Persona persona1("Joel", 21);

    // Llamar al método mostrarDatos
    persona1.mostrarDatos();

    return 0;
}

