#include <iostream>
using namespace std;

class Persona {
  private:
    string nombre;
    int edad;
    float estatura;

  public:
    Persona(string nombre, int edad, float estatura) {
      this->nombre = nombre;
      this->edad = edad;
      this->estatura = estatura;
    }

    string getNombre() {
      return this->nombre;
    }

    int getEdad() {
      return this->edad;
    }

    float getEstatura() {
      return this->estatura;
    }

    string toString() {
      return "{nombre='" + nombre + "'" + 
            ", edad='" + std::to_string(edad) + "'" + 
            ", estatura='" + std::to_string(estatura) + "'" + 
            "}";
    } 
};