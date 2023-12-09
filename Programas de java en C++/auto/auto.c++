#include <iostream>

class Auto {
public:
    std::string marca;
    int velocidad;
    std::string color;
    std::string placa;

    Auto(std::string marca, int velocidad, std::string color, std::string placa)
        : marca(marca), velocidad(velocidad), color(color), placa(placa) {}

    void verificarVelocidad() {
        if (velocidad > 50) {
            std::cout << "Multa al auto " << marca << " de color " << color << " de placas: " << placa
                      << " ,por exceso de velocidad" << std::endl;
        } else {
            std::cout << "Su auto " << marca << " de color " << color << " circula dentro de la velocidad permitida"
                      << std::endl;
        }
    }
};

int main() {
    Auto BMW1("BMW", 25, "NEGRO", "PCC-2002");
    BMW1.verificarVelocidad();

    return 0;
}

