#include <iostream>
#include "Persona.h"
#include "Gerente.h"
#include "Vendedor.h"
#include "VendedorEventual.h"

using namespace std;

int main(int argc, char const *argv[])
{
  Vendedor vendedor = Vendedor("Julio Mancera Castro", 32, 1.73f, "Electrónica");
  cout << vendedor.toString() << endl;

  Gerente gerente = Gerente("Maribel Estrada Contreras", 34, 1.70f, "Chalco");       
  cout << gerente.toString() << endl;

  VendedorEventual vendedorE = VendedorEventual("Rosa Castro Luján", 25, 1.75f, "Ropa", 200.0f);
	cout << vendedorE.toString() << endl;
  
  return 0;
}
