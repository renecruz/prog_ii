#include <chrono>
#include <iostream>
#include <list>
#include <random>
#include <vector>

using namespace std;

// variable para generar aleatorios
mt19937 gen(chrono::system_clock::now().time_since_epoch().count());

// function shuffle
template <class T>
void shuffleList(list<T> &L) {
  vector<T> V(L.begin(), L.end());
  shuffle(V.begin(), V.end(), gen);
  L.assign(V.begin(), V.end());
}

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

  cout << "-Desordenado-" << endl;
  imprimeLista("Colores", colores);

  cout << "-Ordenado-" << endl;
  colores.sort();
  imprimeLista("Colores", colores);

  cout << "-Reversa-" << endl;
  colores.reverse();
  imprimeLista("Colores", colores);

  shuffleList(colores);
  cout << "-Aleatorio-" << endl;
  imprimeLista("Colores", colores);

  return 0;
}