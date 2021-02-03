#include <iostream>

using namespace std;

class PersonaV4 {
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
      if (nombre.empty()) {
        this->nombre = "Indefinido";
        cout << "Nombre vacio, verifique" << endl;
      } else {
        this->nombre = nombre;
      }
    }

    int getEdad() {
      return this->edad;
    }

    void setEdad(int edad) {
      if (edad < 0 || edad > 100) {
        this->edad = 0;
        cout << "No se admiten edades negativas o mayores a 100 años" << endl;
      } else {
        this->edad = edad;
      }
    }

    float getEstatura() {
      return this->estatura;
    }

    void setEstatura(float estatura) {
      if (estatura < 0.5f || estatura > 3.0f) {
        this->estatura = 0.5f;
        cout << "No se admiten estaturas menores a 0.5m o mayores a 3.0m" << endl;
      } else {
        this->estatura = estatura;
      }
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
  PersonaV4 persona = PersonaV4();
  persona.setNombre("");
  persona.setEdad(-4);
  persona.setEstatura(313.0f);

  cout << persona.toString() << endl;
  /* 
    Nombre vacio, verifique
    No se admiten edades negativas o mayores a 100 años
    No se admiten estaturas menores a 0.5m o mayores a 3.0m
    { nombre='Indefinido', edad='0', estatura='0.5'}
  */
  
  return 0;
}

