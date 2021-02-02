package mx.uaemex.controller;

import mx.uaemex.data.Producto;
import java.util.Vector;

public class ProductoController
{   
    /*
     * Se especifíca la colección que queremos crear para evitar
     * usar la clase vector con objetos "genéricos".
     */
    private Vector<Producto> v = new Vector();
    
    public ProductoController() {
        v.add(new Producto(1,"Tenis","Calzado deportivo en diversas tallas",2000.0f));
        v.add(new Producto(2,"Cartera","Cartera en piel para dama",1000.0f));
        v.add(new Producto(3,"Pants","Ropa deportiva unisex",950.0f));
        v.add(new Producto(4,"Gorra","Gorra de teporada",200.0f));
        verCatalogo();
    }

    
    public void verCatalogo() {
        //For Each -> implementado a partir de la version 5.0 de Java
        for (Producto p: v) {
            p.getInfo();
        }
    }
    
    public static void main(String args[]) {
        new ProductoController();
    }
}