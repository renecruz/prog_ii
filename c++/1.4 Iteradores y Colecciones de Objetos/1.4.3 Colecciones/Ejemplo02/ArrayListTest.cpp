#include <iostream>
#include <list>

using namespace std;

void imprimeLista(string nombre, list<string> miLista) {
  cout << nombre << ": [";
  for (list<string>::iterator it = miLista.begin(); it != miLista.end();) {
    cout << *it;
    if (++it != miLista.end()) {
      cout << ", ";
    }
  }
  cout << "]" << endl;
}

int main(int argc, char const *argv[]) {
  list<string> colores;

  // Se agregan valores iniciales al vector
  colores.push_back("Rojo");
  colores.push_back("Blanco");
  colores.push_back("Amarillo");
  colores.push_back("Negro");
  colores.push_back("Azul");

  // imprime Lista
  imprimeLista("Colores", colores);

  // Primer operación "add: push_back()"
  colores.push_back("Rosa");
  imprimeLista("Colores", colores);

  // Segunda operación "set: next()"
  *next(colores.begin(), 3) = "Verde";
  imprimeLista("Colores", colores);

  // Tercera operación "remove: erase()"
  colores.erase(next(colores.begin(), 1));
  imprimeLista("Colores", colores);

  // Cuarta operación "get: next()"
  string color = *next(colores.begin(), 4);
  cout << "Color: " << color << endl;

  return 0;
}