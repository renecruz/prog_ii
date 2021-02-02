package mx.uaemex.controller;

import mx.uaemex.data.Producto;
import java.util.Vector;

public class ProductoController
{   
    private Vector v = new Vector();
    
    public ProductoController() {
        v.add(new Producto(1,"Tenis","Calzado deportivo en diversas tallas",2000.0f));
        v.add(new Producto(2,"Cartera","Cartera en piel para dama",1000.0f));
        v.add(new Producto(3,"Pants","Ropa deportiva unisex",950.0f));
        v.add(new Producto(4,"Gorra","Gorra de teporada",200.0f));
        verCatalogoV1();
    }

    public void verCatalogoV1() {
        for (int i=0; i< v.size(); i++) {
            Producto p = (Producto) v.elementAt(i); // Se aplica Casting
            p.getInfo();
        }
    }
    
    
    public void verCatalogoV2() {
        for (int i=0; i< v.size(); i++) {
            ((Producto) v.elementAt(i) ).getInfo();
        }
    }
    
    public static void main(String args[]) {
        new ProductoController();
    }
}