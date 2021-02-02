    package com.ditamex.controller;
    
    import com.ditamex.data.Cliente;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Comparator;
    
    public class ClienteController
{
    /*
     * Revisar la documentación de la interfaz Comparator
     * https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
     */
    
    public ClienteController(){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        clientes.add(new Cliente(101345, "Juan Rosas Pérez", "juanrp@gmail.com"));
        clientes.add(new Cliente(101289, "Ma. de Lourdes López Santiago", "mlls@yahoo.com"));
        clientes.add(new Cliente(101821, "Roberto Gómez Juárez", "roberto135@empresa.com"));
        clientes.add(new Cliente(101676, "Ana Fuentes Granados", "afg@ditamex.com"));
        clientes.add(new Cliente(101123, "Lucia Murrieta Flores", "lmurrietaf@sutienda.com"));
        
        System.out.println("- Order original -");
        for (Cliente cliente: clientes) {
            System.out.println(cliente);
        }
        
        Collections.sort(clientes);

        System.out.println("- Orderados por No. de Cliente -");
        for (Cliente cliente: clientes) {
            System.out.println(cliente);
        }
        
        Comparator<Cliente> comparadorPorNombre = new Comparator<Cliente>(){
            @Override
            public int compare(Cliente cliente1, Cliente cliente2) {
                return ( cliente1.getNombre().compareTo( cliente2.getNombre() ) );
            }
        };
        
        Collections.sort(clientes, comparadorPorNombre);

        System.out.println("- Orderados por Nombre -");
        for (Cliente cliente: clientes) {
            System.out.println(cliente);
        }
        
        
    }
    
    public static void main(String args[]) {
        new ClienteController();
    }
    
}