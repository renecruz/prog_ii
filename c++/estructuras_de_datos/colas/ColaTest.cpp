
#include <iostream>
#include <string>

using namespace std;

class Cola {

  struct Nodo {
    int dato;
    Nodo *siguiente;
    Nodo *anterior;
  };

  public:
    Nodo *cola;
    Nodo *frente;
    Cola() {
      cola = NULL;
    }

  void push(int dato) {
    cout << "Insertando: " << dato << endl;
    Nodo *nuevoNodo = new Nodo();
    nuevoNodo->dato = dato;
    if (cola != NULL) {
      nuevoNodo->siguiente = cola;
      cola->anterior = nuevoNodo;
      cola = nuevoNodo;
    } else {
      cola = nuevoNodo;
      frente = nuevoNodo;
    }
  }

  void pop() {
    if (cola != NULL){
      cout << "Quitando: " << frente->dato << endl;
      frente = frente->anterior;
      frente->siguiente = NULL;
    }
  }

  void verCola() {
    if (cola != NULL) {
      Nodo *nodoActual = cola;
      cout << "Cola: [";
      while (nodoActual != NULL) {
        cout << to_string(nodoActual->dato) << ",";
        nodoActual = nodoActual->siguiente;
      }
      cout << "\b]" << endl;
    } else {
      cout << "Cola vacía" << endl;
    }
  }

  void vaciarCola() {
    cola = NULL;
    cout << "La cola se ha vaciado" << endl;
  }
};

int main(int argc, char const *argv[]) {
  Cola cola = Cola();
  cola.verCola();
  cola.push(666);
  cola.push(1);
  cola.verCola();
  cola.push(1000);
  cola.push(500);
  cola.verCola();
  cola.pop();
  cola.verCola();
  cola.vaciarCola();
  cola.verCola();
  return 0;
}

/*  Salida en consola: 

    Cola vacía
    Insertando: 666
    Insertando: 1
    Cola: [1,666,]
    Insertando: 1000
    Insertando: 500
    Cola: [500,1000,1,666]
    Quitando: 666
    Cola: [500,1000,1]
    La cola se ha vaciado
    Cola vacía
*/
