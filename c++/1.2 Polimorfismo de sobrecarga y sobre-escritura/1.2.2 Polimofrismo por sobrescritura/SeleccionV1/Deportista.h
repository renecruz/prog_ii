#include <iostream>

using namespace std;

class Deportista{
  private:
    string nombre;
    int edad;
    float estatura;

  public:
    Deportista(string nombre, int edad, float estatura) {
      this->nombre = nombre;
      this->edad = edad;
      this->estatura = estatura;
    }

    void entrenar() {
      cout << "Entrenando duro!" << endl;
    }

    void competir() {
      cout << "Ganemos esta competencia!" << endl;
    }

    string toString() {
      return "{nombre='" + nombre + "'" +
            ", edad='" + to_string(edad) + "'" +
            ", estatura='" + to_string(estatura) + "'" +
            "}";
    }
};