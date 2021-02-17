#include <iostream>
#include <vector>

#include "Producto.h"

using namespace std;

template <class T>
class ProductoContoller {
 private:
  vector<T> v;  //Vector Genérico que puede contener cualquier tipo de objeto

 public:
  ProductoContoller() {
    v.push_back(Producto(1, "Tenis", "Calzado deportivo en diversas tallas", 2000.0f));
    v.push_back(Producto(2, "Cartera", "Cartera en piel para dama", 1000.0f));
    v.push_back(Producto(3, "Pants", "Ropa deportiva unisex", 950.0f));
    v.push_back(Producto(4, "Gorra", "Gorra de teporada", 200.0f));
    verCatalogoV1();
  }

  void verCatalogoV1() {
    for (int i = 0; i < v.size(); i++) {
      Producto p = (Producto)v.at(i);  // Se aplica Casting
      p.getInfo();
    }
  }

  void verCatalogoV2() {  // Método simplificado
    for (int i = 0; i < v.size(); i++) {
      v.at(i).getInfo();
    }
  }
};

int main(int argc, char const *argv[]) {
  ProductoContoller<Producto> productoController;
  return 0;
}
