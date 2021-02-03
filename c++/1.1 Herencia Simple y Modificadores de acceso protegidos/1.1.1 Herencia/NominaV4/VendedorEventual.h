#include <iostream>

using namespace std;

class VendedorEventual : public Vendedor {
  private:
    float sueldoPorDia;

  public:
    VendedorEventual(string nombre, int edad, float estatura, string departamento, float sueldoPorDia) : Vendedor(nombre, edad, estatura, departamento) {
      this->sueldoPorDia = sueldoPorDia;
    }

    float getsueldoPorDia() {
    return this->sueldoPorDia;
  }

    void comisionPorVenta(float montoVenta) {
      cout << "Ha ganado una porcentaje de: " 
           << (montoVenta * 0.10)  << endl; // 10% de la venta
    }

  
    string toString() {
      return "{" + 
            Vendedor::toString() + 
            ", sueldoPorDia='" + std::to_string(sueldoPorDia) + "'" +
            "}";
    } 
};