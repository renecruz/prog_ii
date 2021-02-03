#include <iostream>

using namespace std;

class PersonaV2 {
  public: 
    string nombre;
    int edad;
    float estatura;

    string toString() {
      return "{nombre='" + nombre + "'" + 
            ", edad='" + std::to_string(edad) + "'" + 
            ", estatura='" + std::to_string(estatura) + "'" + 
            "}";
    }
};

int main(int argc, char const *argv[])
{
  PersonaV2 persona = PersonaV2();
  persona.nombre = "";
  persona.edad = -4;
  persona.estatura = 313.0f;

  cout << persona.toString() << endl;
  // {nombre='', edad='-4', estatura='313.0'}
  
  return 0;
}

