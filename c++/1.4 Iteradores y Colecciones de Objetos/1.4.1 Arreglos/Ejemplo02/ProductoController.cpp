#include <iostream>
#include "Producto.h"

using namespace std;

class ProductoContoller {
  private:
    Producto *p[4];

  public:
    ProductoContoller() {
      p[0] = new Producto(1, "Tenis", "Calzado deportivo en diversas tallas", 2000.0f);
      p[1] = new Producto(2, "Cartera", "Cartera en piel para dama", 1000.0f);
      p[2] = new Producto(3, "Pants", "Ropa deportiva unisex", 950.0f);
      p[3] = new Producto(4, "Gorra", "Gorra de teporada", 200.0f);
      verCatalogo();
    }

    void verCatalogo() {
      int length = sizeof(p) / sizeof(p[0]);
      for (int i = 0; i < length; i++)
      {
        p[i]->getInfo();
      }
    }
};

int main(int argc, char const *argv[]) {
  ProductoContoller productoController;
  return 0;
}
