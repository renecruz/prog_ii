#include <iostream>

using namespace std;

class Cliente {
 private:
  int numCliente;
  string nombre;
  string email;

 public:
  bool operator<(const Cliente &otroCliente) const{ 
    return numCliente < otroCliente.numCliente; 
  }

  Cliente(int numCliente, string nombre, string email) {
    this->numCliente = numCliente;
    this->nombre = nombre;
    this->email = email;
  }

  int getNumCliente() { return numCliente; }

  string getNombre() { return nombre; }

  string getEmail() { return email; }

  string toString() {
    return "No. Cliente: " + to_string(numCliente) + 
          ", Nombre: " + nombre +
          ", Email: " + email;
  }
};