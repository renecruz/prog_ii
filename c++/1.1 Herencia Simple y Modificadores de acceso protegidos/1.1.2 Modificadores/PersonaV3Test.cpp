#include <iostream>

using namespace std;

class PersonaV3 {
  /*                - MODIFICADORES DE ACCESO -
  +------------------------------------------------------------------+
  |   Modificador    |   Clase   | SubClase  |  Paquete  |    Todos  |
  +------------------+-----------+-----------+-----------+-----------|
  | public           |     sí    |    sí     |     sí    |    sí     |
  +------------------+-----------+-----------+-----------+-----------|
  | private          |     sí    |    no     |     no    |    no     |
  +------------------+-----------+-----------+-----------+-----------|
  | protected        |     sí    |    sí     |     sí    |    no     |
  +------------------+-----------+-----------+-----------+-----------|
  */

  private:
    string nombre;
    int edad;
    float estatura;

  public: 
    string getNombre() {
      return this->nombre;
    }

    void setNombre(string nombre) {
        this->nombre = nombre;
    }

    int getEdad() {
      return this->edad;
    }

    void setEdad(int edad) {
      this->edad = edad;
    }

    float getEstatura() {
      return this->estatura;
    }

    void setEstatura(float estatura) {
      this->estatura = estatura;
    }

    string toString() {
      return "{nombre='" + nombre + "'" + 
            ", edad='" + std::to_string(edad) + "'" + 
            ", estatura='" + std::to_string(estatura) + "'" + 
            "}";
    }
};

int main(int argc, char const *argv[])
{
  PersonaV3 persona = PersonaV3();
  persona.setNombre("");
  persona.setEdad(-4);
  persona.setEstatura(313.0f);

  cout << persona.toString() << endl;
  // {nombre='', edad='-4', estatura='313.0'}
  
  return 0;
}

