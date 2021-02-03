#include <iostream>

using namespace std;

class PersonaV1 {
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
  PersonaV1 persona = PersonaV1();
  persona.nombre = "Fernando López";
  persona.edad = 22;
  persona.estatura = 1.70f;

  cout << persona.toString() << endl;
  // {nombre='Fernando López', edad='22', estatura='1.7'}
  
  return 0;
}

