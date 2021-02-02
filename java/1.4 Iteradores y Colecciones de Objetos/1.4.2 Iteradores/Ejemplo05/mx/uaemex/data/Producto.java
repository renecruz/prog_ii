package mx.uaemex.data;


public class Producto
{
    private int id; 
    private String nombre;
    private String descripcion;
    private float precio;
    
    public Producto(int id, String nombre, String descripcion, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public int getId() {
        return id;
    }
    
    public void getInfo(){
        System.out.println("Info: " + 
                           "ID: " + id + "\n" +
                           "Nombre: " + nombre + "\n" +
                           "Descripción: " + descripcion + "\n" +
                           "Precio: " + precio);
    }
    
}