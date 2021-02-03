#include <iostream>
using namespace std;

class Gerente {
  private:
    string nombre;
    int edad;
    float estatura;
    string sucursal;

  public:
    Gerente(string nombre, int edad, float estatura, string sucursal) {
      this->nombre = nombre;
      this->edad = edad;
      this->estatura = estatura;
      this->sucursal = sucursal;
    }

   string getNombre() {
    return this->nombre;
  }

   int getEdad() {
    return this->edad;
  }

   float getEstatura() {
    return this->estatura;
  }

   string getsucursal() {
    return this->sucursal;
  }

   void comisionPorVentas(float ventasTotales) {
    cout << "Ha ganado una porcentaje del: "  
                   <<  (ventasTotales * 0.10) << endl; // 10% de la ventas totales
  }

  string toString() {
      return "{nombre='" + nombre + "'" + 
            ", edad='" + std::to_string(edad) + "'" + 
            ", estatura='" + std::to_string(estatura) + "'" + 
            ", sucursal='" + sucursal + "'" +
            "}";
    }  
};