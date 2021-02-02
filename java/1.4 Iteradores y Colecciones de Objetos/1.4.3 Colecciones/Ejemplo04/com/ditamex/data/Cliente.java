package com.ditamex.data;

import java.lang.Comparable;

public class Cliente implements Comparable<Cliente>
{
    /*
     * Referirse a la documentación de Collections, Comparable e Integer.comparteTo()
     * https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
     */
    
    private Integer numCliente;
    private String nombre;
    private String email;
    
    public int compareTo(Cliente cliente) { //Comparar los campos por lo que deseamos ordenar estos objetos
        return numCliente.compareTo( cliente.getNumCliente() );
    }
    
    public Cliente(Integer numCliente, String nombre, String email) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.email = email;
    }
    
    public Integer getNumCliente(){
        return numCliente;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getEmail(){
        return email;
    }
    
    @Override
    public String toString(){
        return "No. Cliente: " + numCliente +", Nombre: " + nombre + ", Email: " + email;
    }
}