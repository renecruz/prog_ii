#include <iostream>
#include <list>

#include "Cliente.h"

using namespace std;

void imprimeLista(string nombreLista, list<Cliente> miLista) {
  cout << nombreLista << ": \n";
  for (list<Cliente>::iterator it = miLista.begin(); it != miLista.end();) {
    cout << it->toString();
    if (++it != miLista.end()) {
      cout << "\n";
    }
  }
  cout << endl;
}

class ComparadorPorNombre { 
  //clase con la función para comparar clientes por nombre
  //opcionalmente se puede crear en un archivo separado .h
 public:
  bool operator()( Cliente &cliente1,  Cliente &cliente2) {
    return cliente1.getNombre() < cliente2.getNombre();
  }
};

int main(int argc, char const *argv[]) {
  list<Cliente> clientes;

  clientes.push_back(Cliente(101345, "Juan Rosas Pérez", "juanrp@gmail.com"));
  clientes.push_back(Cliente(101289, "Ma. de Lourdes López Santiago", "mlls@yahoo.com"));
  clientes.push_back(Cliente(101821, "Roberto Gómez Juárez", "roberto135@empresa.com"));
  clientes.push_back(Cliente(101676, "Ana Fuentes Granados", "afg@ditamex.com"));
  clientes.push_back(Cliente(101123, "Lucia Murrieta Flores", "lmurrietaf@sutienda.com"));

  imprimeLista("Clientes", clientes);

  clientes.sort(); //ordena por número de cliente
  cout << "- Orderados por No. de Cliente -" << endl;
  imprimeLista("Clientes", clientes);

  ComparadorPorNombre comparadorPorNombre;
  clientes.sort(comparadorPorNombre); //ordena por nombre de cliente
  cout << "- Orderados por Nombre -" << endl;
  imprimeLista("Clientes", clientes);

  return 0;
}
