#include <iostream>
#include <list>

using namespace std;

void imprimeLista(list<string> miLista) {
  cout << "[";
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

  cout << "- Colores antes de la eliminación -" << endl;
  imprimeLista(colores);

  list<string>::iterator iterador = colores.begin(); //el iterador apunta al inicio de la lista
  while (iterador != colores.end())  { //mientras el iterador no llegue al final...
    if (*iterador == "Amarillo") { //si el objeto en el iterador es igual a la cadena "Amarillo"
      colores.erase(iterador); //elimina de la lista el objeto en esa posición..
    }
    iterador++; //avanza el iterador a la siguiente posición de la lista
  }

  cout << "- Colores después de la eliminación -" << endl;
  imprimeLista(colores);

  return 0;
}