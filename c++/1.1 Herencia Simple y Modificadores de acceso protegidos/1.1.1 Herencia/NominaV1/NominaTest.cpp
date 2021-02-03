#include <iostream>
#include "Vendedor.h"

using namespace std;

int main(int argc, char const *argv[])
{
  Vendedor vendedor = Vendedor("Julio Mancera Castro", 32, 1.73f, "Electrónica");
  cout << vendedor.toString() << endl;
  return 0;
}
