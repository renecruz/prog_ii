#include <iostream>
using namespace std;

class Vendedor {
  private:
    string nombre;
    int edad;
    float estatura;
    string departamento;

  public:
    Vendedor(string nombre, int edad, float estatura, string departamento) {
      this->nombre = nombre;
      this->edad = edad;
      this->estatura = estatura;
      this->departamento = departamento;
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

    string getDepartamento() {
      return this->departamento;
    }

    void comisionPorVenta(float montoVenta) {
      cout << "Ha ganado una porcentaje de: " 
           << (montoVenta * 0.10)  << endl; // 10% de la venta
    }

  
    string toString() {
      return "{nombre='" + nombre + "'" + 
            ", edad='" + std::to_string(edad) + "'" + 
            ", estatura='" + std::to_string(estatura) + "'" + 
            ", departamento='" + departamento + "'" + 
            "}";
    } 
};