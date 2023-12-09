#include <iostream>
#include <limits>
#include <stdexcept>

class Persona {
public:
    std::string nombre;
    int edad;
    double cedula;

    Persona(std::string nombre, int edad, double cedula) : nombre(nombre), edad(edad), cedula(cedula) {}

    void comer() {
        std::cout << nombre << " est� comiendo." << std::endl;
    }

    void dormir() {
        std::cout << nombre << " est� durmiendo." << std::endl;
    }
};

class Visitante : public Persona {
private:
    std::string numCarnet;

public:
    Visitante(std::string nombre, int edad, double cedula, std::string numCarnet)
        : Persona(nombre, edad, cedula), numCarnet(numCarnet) {}

    void comprar() {
        std::cout << nombre << " con c�dula " << cedula << " y n�mero de carnet " << numCarnet
                  << " est� comprando boletos." << std::endl;
    }
};

class Cuidador : public Persona {
private:
    std::string numId;

public:
    Cuidador(std::string nombre, int edad, double cedula, std::string numId)
        : Persona(nombre, edad, cedula), numId(numId) {}

    void alimentarAnimales() {
        std::cout << "El cuidador " << nombre << " con c�dula " << cedula
                  << " y n�mero de identificaci�n " << numId << " est� alimentando animales." << std::endl;
    }
};

class Zoo {
private:
    std::string nombre;
    std::string numRegistro;

public:
    Zoo(std::string nombre, std::string numRegistro) : nombre(nombre), numRegistro(numRegistro) {}

    void mostrarInformacion() {
        std::cout << "Zoo: " << nombre << ", N�mero de Registro: " << numRegistro << std::endl;
    }
};

class Leon {
private:
    std::string nombre;
    std::string vacuna;
    double cantidadVacuna;

public:
    Leon(std::string nombre, std::string vacuna, double cantidadVacuna)
        : nombre(nombre), vacuna(vacuna), cantidadVacuna(cantidadVacuna) {}

    void rugir() {
        std::cout << "El le�n " << nombre << " est� rugiendo." << std::endl;
    }

    void cazar() {
        std::cout << "El le�n " << nombre << " est� cazando." << std::endl;
    }
};

class Pinguino {
private:
    std::string nombre;
    std::string vacuna;
    double cantidadVacuna;

public:
    Pinguino(std::string nombre, std::string vacuna, double cantidadVacuna)
        : nombre(nombre), vacuna(vacuna), cantidadVacuna(cantidadVacuna) {}

    void nadar() {
        std::cout << "El ping�ino " << nombre << " est� nadando." << std::endl;
    }

    void pescar() {
        std::cout << "El ping�ino " << nombre << " est� pescando." << std::endl;
    }
};

int main() {
    bool continuar = true;

    while (continuar) {
        try {
            // Ingreso de datos del zool�gico
            std::cout << "Ingrese el nombre del zoo:" << std::endl;
            std::string nombreZoo;
            std::getline(std::cin, nombreZoo);

            std::cout << "Ingrese el n�mero de registro del zoo:" << std::endl;
            std::string numRegistroZoo;
            std::getline(std::cin, numRegistroZoo);

            // Creaci�n del objeto zoo
            Zoo zoo(nombreZoo, numRegistroZoo);
            zoo.mostrarInformacion();

            // Ingreso de datos del visitante
            std::cout << "Ingrese el nombre del visitante:" << std::endl;
            std::string nombreVisitante;
            std::getline(std::cin, nombreVisitante);

            std::cout << "Ingrese la edad del visitante:" << std::endl;
            int edadVisitante;
            std::cin >> edadVisitante;
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

            std::cout << "Ingrese la c�dula del visitante:" << std::endl;
            double cedulaVisitante;
            std::cin >> cedulaVisitante;
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

            std::cout << "Ingrese el n�mero de carnet del visitante:" << std::endl;
            std::string numCarnetVisitante;
            std::getline(std::cin, numCarnetVisitante);

            // Creaci�n del objeto visitante
            Visitante visitante(nombreVisitante, edadVisitante, cedulaVisitante, numCarnetVisitante);
            visitante.comprar();

            // Ingreso de datos del cuidador
            std::cout << "Ingrese el nombre del cuidador:" << std::endl;
            std::string nombreCuidador;
            std::getline(std::cin, nombreCuidador);

            std::cout << "Ingrese la edad del cuidador:" << std::endl;
            int edadCuidador;
            std::cin >> edadCuidador;
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

            std::cout << "Ingrese la c�dula del cuidador:" << std::endl;
            double cedulaCuidador;
            std::cin >> cedulaCuidador;
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

            std::cout << "Ingrese el n�mero de identificaci�n del cuidador:" << std::endl;
            std::string numIdCuidador;
            std::getline(std::cin, numIdCuidador);

            // Creaci�n del objeto cuidador
            Cuidador cuidador(nombreCuidador, edadCuidador, cedulaCuidador, numIdCuidador);
            cuidador.alimentarAnimales();

            // Ingreso de datos y creaci�n de objeto Le�n
            std::cout << "Ingrese el nombre del le�n:" << std::endl;
            std::string nombreLeon;
            std::getline(std::cin, nombreLeon);

            std::cout << "Ingrese la vacuna del le�n:" << std::endl;
            std::string vacunaLeon;
            std::getline(std::cin, vacunaLeon);

            std::cout << "Ingrese la cantidad de vacuna del le�n:" << std::endl;
            double cantidadVacunaLeon;
            std::cin >> cantidadVacunaLeon;
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

            Leon leon(nombreLeon, vacunaLeon, cantidadVacunaLeon);
            leon.rugir();
            leon.cazar();

            // Ingreso de datos y creaci�n de objeto Pinguino
            std::cout << "Ingrese el nombre del ping�ino:" << std::endl;
            std::string nombrePinguino;
            std::getline(std::cin, nombrePinguino);

            std::cout << "Ingrese la vacuna del ping�ino:" << std::endl;
            std::string vacunaPinguino;
            std::getline(std::cin, vacunaPinguino);

            std::cout << "Ingrese la cantidad de vacuna del ping�ino:" << std::endl;
            double cantidadVacunaPinguino;
            std::cin >> cantidadVacunaPinguino;
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

            Pinguino pinguino(nombrePinguino, vacunaPinguino, cantidadVacunaPinguino);
            pinguino.nadar();
            pinguino.pescar();

            std::cout << "�Desea continuar? (S/N): ";
            std::string respuesta;
            std::getline(std::cin, respuesta);
            continuar = (respuesta == "S" || respuesta == "s");

        } catch (std::invalid_argument& e) {
            std::cerr << "Error: " << e.what() << std::endl;
        } catch (std::out_of_range& e) {
            std::cerr << "Error: " << e.what() << std::endl;
        } catch (...) {
            std::cerr << "Error desconocido." << std::endl;
        }
    }

    return 0;
}

