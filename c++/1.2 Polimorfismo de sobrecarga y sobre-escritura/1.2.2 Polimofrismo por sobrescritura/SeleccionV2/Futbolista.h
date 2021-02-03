#include <iostream>

using namespace std;

class Futbolista : public Deportista {
  private:
    string posicion;
  
  public:
    Futbolista(string nombre, int edad, float estatura, string posicion) : Deportista(nombre, edad, estatura) {
      this->posicion = posicion;
    }  

    string toString() {
      return  "{" + Deportista::toString() +
              " posicion='" + posicion + "'" +
              "}";
    }
};