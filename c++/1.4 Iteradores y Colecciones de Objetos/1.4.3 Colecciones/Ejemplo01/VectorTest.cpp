#include <iostream>
#include <vector>

using namespace std;

void imprimeVector(string nombre, vector<string> miVector) {
  cout << nombre << ": [";
  for (int x = 0; x < miVector.size(); x++) {
    cout << miVector[x];
    if (x != miVector.size() - 1) {
      cout << ", ";
    }
  }
  cout << "]" << endl;
}

int main(int argc, char const *argv[]) {
  // Se inicializa el vector con "cero" elementos
  vector<string> colores;

  // Se agregan valores iniciales al vector
  colores.push_back("Rojo");
  colores.push_back("Blanco");
  colores.push_back("Amarillo");
  colores.push_back("Negro");
  colores.push_back("Azul");

  imprimeVector("Colores", colores);

  // Primer operación "add: push_back()"
  colores.push_back("Rosa");
  imprimeVector("Colores", colores);

  // Segunda operación "set: at()"
  colores.at(3) = "Verde";  // también: colores[3] = "Verde";
  imprimeVector("Colores", colores);

  // Tercera operación "remove: erase()"
  colores.erase(colores.begin() + 1);
  imprimeVector("Colores", colores);

  // Cuarta operación "get: at()"
  string color = colores.at(4);  // también: string color = colores[4]
  cout << "Color: " << color << endl;

  return 0;
}
