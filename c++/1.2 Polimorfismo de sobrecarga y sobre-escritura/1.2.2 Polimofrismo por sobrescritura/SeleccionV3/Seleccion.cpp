#include <iostream>
#include "Deportista.h"
#include "Boxeador.h"
#include "Futbolista.h"

using namespace std;

int main(int argc, char const *argv[])
{
  Deportista deportista = Deportista("Jose Antonio Juárez", 23, 1.74f);
  cout << deportista.toString() << endl; // {nombre='Jose Antonio Juárez', edad='23', estatura='1.74'} 
  deportista.entrenar(); // Entrenando duro!
  deportista.competir(); // Ganemos esta competencia!

  Boxeador boxeador = Boxeador("Canelo Álvarez", 30, 1.75f, "Peso Mediano");
  cout << boxeador.toString() << endl; // {nombre='Canelo Álvarez', edad='30', estatura='1.75'}
  boxeador.entrenar(); // Haciendo 15 minutos de cuerda y 20 abdominales...
  boxeador.competir(); // ¡En guardia!, Jab, Gancho al higado...

  Futbolista futbolista = Futbolista("Lionel Messi", 33, 1.7f, "Delantero");
  cout << futbolista.toString() << endl; // {nombre='Lionel Messi', edad='33', estatura='1.7'}
  futbolista.entrenar(); // Calentando, haciendo sprints, trotanto...
  futbolista.competir(); // Cubriendo jugador, recibiendo pase, metiendo gol!

  return 0;
}
