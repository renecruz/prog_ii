#include <iostream>
#include "Deportista.h"

using namespace std;

int main(int argc, char const *argv[])
{
  Deportista deportista = Deportista("Jose Antonio Juárez", 23, 1.74f);
  cout << deportista.toString() << endl; // {nombre='Jose Antonio Juárez', edad='23', estatura='1.74'} 
  deportista.entrenar(); // Entrenando duro!
  deportista.competir(); // Ganemos esta competencia!

  return 0;
}
