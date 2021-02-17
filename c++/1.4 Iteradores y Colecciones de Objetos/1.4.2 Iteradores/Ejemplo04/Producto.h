#include <iostream>

using namespace std;

class Producto {
 private:
  int id;
  string nombre;
  string descripcion;
  float precio;

 public:
  Producto(int id, string nombre, string descripcion, float precio) {
    this->id = id;
    this->nombre = nombre;
    this->descripcion = descripcion;
    this->precio = precio;
  }

  void getInfo() {
    cout << "Info: "
         << "ID: " << id << endl
         << "Nombre: " << nombre << endl
         << "Descripción: " << descripcion << endl
         << "Precio: " << precio << endl;
  }
};