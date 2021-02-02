package mx.uaemex.controller;

import mx.uaemex.data.Producto;

public class ProductoController
{
    private Producto p[] = new Producto[4];
    
    public ProductoController() {
        p[0] = new Producto(1,"Tenis","Calzado deportivo en diversas tallas",2000.0f);
        p[1] = new Producto(2,"Cartera","Cartera en piel para dama",1000.0f);
        p[2] = new Producto(3,"Pants","Ropa deportiva unisex",950.0f);
        p[3] = new Producto(4,"Gorra","Gorra de teporada",200.0f);
        verCatalogo();
    }
    
    public void verCatalogo() {
        for (int i=0; i< p.length; i++) {
            p[i].getInfo();
        }
    }
    
    public static void main(String args[]) {
        new ProductoController();
    }
}