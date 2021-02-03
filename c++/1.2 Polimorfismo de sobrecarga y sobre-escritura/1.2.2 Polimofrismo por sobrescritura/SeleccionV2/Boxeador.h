#include <iostream>

using namespace std;

class Boxeador : public Deportista {
  private:
    string peso;
  
  public:
    Boxeador(string nombre, int edad, float estatura, string peso) : Deportista(nombre, edad, estatura) {
      this->peso = peso;
    }  

    string toString() {
      return  "{" + Deportista::toString() +
              " peso='" + peso + "'" +
              "}";
    }
};