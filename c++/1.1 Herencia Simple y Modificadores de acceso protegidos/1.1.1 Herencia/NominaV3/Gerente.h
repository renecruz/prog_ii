#include <iostream>

using namespace std;

class Gerente : public Persona {
  private:
    string sucursal;

  public:
    Gerente(string nombre, int edad, float estatura, string sucursal) : Persona(nombre, edad, estatura) {
      this->sucursal = sucursal;
    }

    string getSucursal() {
      return this->sucursal;
    }

    void comisionPorVenta(float montoVenta) {
      cout << "Ha ganado una porcentaje de: " 
           << (montoVenta * 0.10)  << endl; // 10% de la venta
    }

  
    string toString() {
      return "{" + 
            Persona::toString() + 
            ", sucursal='" + sucursal + "'" + 
            "}";
    } 
};