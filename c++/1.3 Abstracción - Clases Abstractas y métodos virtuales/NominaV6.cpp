#include <iostream>

using namespace std;

class Contribytente {
  public:
   const float IMPUESTO_SOBRE_LA_RENTA = 0.16f;  
   virtual float calculaISR(float sueldo) = 0;
};

class Vendedor {
  private:
    string nombre;
    float sueldoBase;

  public:
    Vendedor(string nombre, float sueldoBase) {
      this->nombre = nombre;
      this->sueldoBase = sueldoBase;
    }

    float getSueldoBase() {
      return this->sueldoBase;
    }

    string getNombre() {
      return nombre;
    }

    virtual float calculaSueldo() = 0;
};

class VendedorBase : public Vendedor, public Contribytente {
  private:
    string depto;

  public:
    VendedorBase(string nombre, float sueldoBase, string depto) : Vendedor(nombre, sueldoBase) {
      this->depto = depto;
    }

    float calculaSueldo() {
      return Vendedor::getSueldoBase();
    }
};

class VendedorPorComision : public Vendedor {
  private:
    int ventasRealizadas;
    const float COMISION_POR_VENTA = 50.0f;

  public:
    VendedorPorComision(string nombre, float sueldoBase, int ventasRealizadas) : Vendedor(nombre, sueldoBase){
      this->ventasRealizadas = ventasRealizadas;
    }

    float calculaSueldo() {
      return Vendedor::getSueldoBase() + (ventasRealizadas * COMISION_POR_VENTA);
    }
};

class VendedorEventual : public Vendedor {
  private:
    int diasTrabajados;
    const float SUELDO_POR_DIA = 100.0f;

  public:
    VendedorEventual(string nombre, float sueldoBase, int diasTrabajados) : Vendedor(nombre, sueldoBase) {
      this->diasTrabajados = diasTrabajados;
    }

    float calculaSueldo() {
      return Vendedor::getSueldoBase() + (diasTrabajados * SUELDO_POR_DIA);
    }
};

int main(int argc, char const *argv[])
{ 
  float nomina = 0;

  Vendedor *vendedores[3];
  vendedores[0] = new VendedorBase("Rosa Ma. López", 3500.0f, "Electrónicos");
  vendedores[1] = new VendedorPorComision("José Rodríguez", 3250.0f, 10);
  vendedores[2] = new VendedorEventual("Julia Vázquez ", 2000.0f, 4);
  
  int len = sizeof(vendedores)/sizeof(vendedores[0]);

  for (int i=0; i<len; i++ ) {
    nomina = nomina + vendedores[i]->calculaSueldo();
    cout << vendedores[i]->getNombre() << ", Sueldo: $" << vendedores[i]->calculaSueldo() << endl;
  }

  cout << "Total de vendedores: " << len << ", Nómina a pagar: $" << nomina << endl;

  return 0;
}
// Compilar como: g++ -std=c++11 NominaV6.cpp -o NominaV6
// para evitar los Warnings por el uso de constantes globales...