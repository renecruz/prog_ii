#include <iostream>

using namespace std;

class Vendedor : public Persona {
  private:
    string departamento;

  public:
    Vendedor(string nombre, int edad, float estatura, string departamento) : Persona(nombre, edad, estatura) {
      this->departamento = departamento;
    }

    string getDepartamento() {
      return this->departamento;
    }

    void comisionPorVenta(float montoVenta) {
      cout << "Ha ganado una porcentaje de: " 
           << (montoVenta * 0.10)  << endl; // 10% de la venta
    }

  
    string toString() {
      return "{" + 
            Persona::toString() + 
            ", departamento='" + departamento + "'" + 
            "}";
    } 
};