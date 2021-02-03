#include <iostream>
#include "Deportista.h"
#include "Boxeador.h"
#include "Futbolista.h"

using namespace std;

int main(int argc, char const *argv[])
{
  Deportista *seleccion[3];
  seleccion[0] = new Deportista("Jose Antornio Juárez", 23, 1.74f);
  seleccion[1] = new Boxeador("Canelo Álvarez", 30, 1.75f, "Peso Mediano");
  seleccion[2] = new Futbolista("Lionel Messi", 33, 1.7f, "Delantero");
  
  for (int i=0; i<3; i++ ) {
    cout << seleccion[i]->toString() << endl;
    seleccion[i]->entrenar();
    seleccion[i]->competir();
  }

  return 0;
}
