#include <iostream>
#include <string>

using namespace std;

struct Nodo {
  int dato;
  Nodo *nodo;
};

class Pila {

public:
  Nodo *pila;

  Pila() {
    pila = NULL;
  }

  void push(int dato) {
    cout << "Insertando: " << dato << endl;
    Nodo *nuevoNodo = new Nodo();
    nuevoNodo->dato = dato;
    if (pila != NULL) {
      nuevoNodo->nodo = pila;
      pila = nuevoNodo;
    } else {
      pila = nuevoNodo;
    }
  }

  void pop() {
    if (pila != NULL){
      cout << "Quitando: " << pila->dato << endl;
      pila = pila->nodo;
    }
  }

  void verPila() {
    if (pila != NULL) {
      Nodo *nodoActual = pila;
      cout << "Pila: [";
      while (nodoActual != NULL) {
        cout << to_string(nodoActual->dato) << ",";
        nodoActual = nodoActual->nodo;
      }
      cout << "\b]" << endl;
    } else {
      cout << "Pila vacía" << endl;
    }
  }

  void vaciarpila() {
    pila = NULL;
    cout << "La Pila se ha vaciado" << endl;
  }
};

int main(int argc, char const *argv[]) {
  Pila pila = Pila();
  pila.verPila();
  pila.push(666);
  pila.push(1);
  pila.verPila();
  pila.push(1000);
  pila.push(500);
  pila.verPila();
  pila.pop();
  pila.verPila();
  pila.vaciarpila();
  pila.verPila();
  return 0;
}

/*  Salida en consola: 

    Pila vacía
    Pila: [1,666]
    Pila: [500,1000,1,666]
    Pila: [1000,1,666]
    La Pila se ha vaciado
    Pila vacía
*/
