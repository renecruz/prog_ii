#include <iostream>

using namespace std;

class Boxeador : public Deportista {
  private:
    string peso;
  
  public:
    Boxeador(string nombre, int edad, float estatura, string peso) : Deportista(nombre, edad, estatura) {
      this->peso = peso;
    }  

    void entrenar() {
      cout << "Haciendo 15 minutos de cuerda y 20 abdominales..." << endl;
    }

    void competir() {
      cout << "¡En guardia!, Jab, Gancho al higado..." << endl;
    }

    string toString() {
      return  "{" + Deportista::toString() +
              " peso='" + peso + "'" +
              "}";
    }
};