#include <iostream>
#include <vector>

#include "Producto.h"

using namespace std;

class ProductoContoller {
 private:
  /*
    * Se especifíca la colección que queremos crear para evitar
    * usar la clase vector con objetos "genéricos".
    */
  vector<Producto> v;

 public:
  ProductoContoller() {
    v.push_back(Producto(1, "Tenis", "Calzado deportivo en diversas tallas", 2000.0f));
    v.push_back(Producto(2, "Cartera", "Cartera en piel para dama", 1000.0f));
    v.push_back(Producto(3, "Pants", "Ropa deportiva unisex", 950.0f));
    v.push_back(Producto(4, "Gorra", "Gorra de teporada", 200.0f));
    verCatalogo();
  }

  void verCatalogo() {  // Método simplificado
    for (int i = 0; i < v.size(); i++) {
      v.at(i).getInfo();
    }
  }
};

int main(int argc, char const *argv[]) {
  ProductoContoller productoController;
  return 0;
}
