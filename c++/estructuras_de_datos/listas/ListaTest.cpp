#include <iostream>
#include <string>

using namespace std;

struct Nodo
{
  int dato;
  Nodo *nodo;
};

class ListaSimple {

  public: 
    Nodo *lista;
    
    ListaSimple() { 
	    lista = NULL;
    }

	void insertar(int dato) {
		cout << "Insertando: " << dato << endl;
		Nodo *nuevoNodo = new Nodo();
    nuevoNodo->dato = dato;
		if (lista != NULL) {

			Nodo *aux1 = lista;
			Nodo *aux2;

			while ((aux1 != NULL) && (aux1->dato < dato)) {
				aux2 = aux1;
				aux1 = aux1->nodo;
			}

			if (lista == aux1) {
				lista = nuevoNodo;
			} else {
				aux2->nodo = nuevoNodo;
			}
			nuevoNodo->nodo = aux1;
		} else {
			lista = nuevoNodo;      
		}
	}

	void verLista() {
		if (lista != NULL) {			      
      Nodo *nodoActual = lista;
      cout << "Lista: [" ;
      while (nodoActual != NULL) {        
        cout  << to_string(nodoActual->dato) << "," ;    
        nodoActual = nodoActual->nodo;
      }
      cout << "\b]" << endl;
		} else {
			cout << "Lista vacía" << endl;
		}
	}

  void buscar(int dato) {
		bool fueEncontrado = false;
		Nodo *nodoBuscado = lista;
		
		while ((nodoBuscado != NULL) && (nodoBuscado->dato <= dato)) {
			if (nodoBuscado->dato == dato) {
				fueEncontrado = true;
			}
			nodoBuscado = nodoBuscado->nodo;
		}

		cout << "El dato " <<  dato << ((fueEncontrado) ? " Si " : " No ") << "se encuentra en la lista" << endl;

	}

	void eliminar(int dato) {
		if (lista != NULL) {
			Nodo *nodoEliminar = lista;
			Nodo *nodoAnterior = NULL;
			while ((nodoEliminar != NULL) && (nodoEliminar->dato != dato)) {
				nodoAnterior = nodoEliminar;
				nodoEliminar = nodoEliminar->nodo;
			}

			if (nodoEliminar == NULL) {
				cout << "El dato " << dato << " no existe" << endl;
			} else if (nodoAnterior == NULL) {
				lista = lista->nodo;
				cout << "El dato " << dato << " se ha eliminado" << endl;
			} else {
				nodoAnterior->nodo = nodoEliminar->nodo;
				cout << "El dato " << dato << " se ha eliminado" << endl;
			}
		}
	}

	void vaciarLista() {
		lista = NULL;
		cout << "La lista se ha vaciado" << endl;
	}
};


int main(int argc, char const *argv[])
{
  ListaSimple lista = ListaSimple();
  lista.verLista();
  lista.insertar(666);  
  lista.insertar(1);
  lista.verLista();
  lista.insertar(1000);
  lista.insertar(500);
  lista.verLista();
  lista.buscar(3);
	lista.eliminar(500);
	lista.verLista();
	lista.vaciarLista();
	lista.verLista();
  return 0;
}

/*  Salida en consola: 

		Lista vacía
		Insertando: 666
		Insertando: 1
		Lista: [1,666]
		Insertando: 1000
		Insertando: 500
		Lista: [1,500,666,1000]
		El dato 3 No se encuentra en la lista
		El dato 500 se ha eliminado
		Lista: [1,666,1000]
		La lista se ha vaciado
		Lista vacía
*/