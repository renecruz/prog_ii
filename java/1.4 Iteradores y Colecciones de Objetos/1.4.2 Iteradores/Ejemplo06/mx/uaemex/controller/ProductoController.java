package mx.uaemex.controller;

import mx.uaemex.data.Producto;
import java.util.Vector;
import java.util.Iterator;

public class ProductoController
{   
    private Vector<Producto> v = new Vector<Producto>();
    
    public ProductoController() {
        v.add(new Producto(1,"Tenis","Calzado deportivo en diversas tallas",2000.0f));
        v.add(new Producto(2,"Cartera","Cartera en piel para dama",1000.0f));
        v.add(new Producto(3,"Pants","Ropa deportiva unisex",950.0f));
        v.add(new Producto(4,"Gorra","Gorra de teporada",200.0f));
        verCatalogo();
        borrarProducto(2);
        verCatalogo();
    }

    public void borrarProducto(int id) {
        Iterator<Producto> it = v.iterator();
        while ( it.hasNext() ) {
            if ( it.next().getId() == id ) {
                it.remove();
            }
        }
    }
    
    
    public void verCatalogo() {
        //Uso de un Iterador para recorrer toda una colección de forma muy eficiente!
        Iterator<Producto> it = v.iterator();
        while ( it.hasNext() ) {
            it.next().getInfo();
        }
    }
    
    public static void main(String args[]) {
        new ProductoController();
    }
}