package com.ditamex.main;

import java.util.ArrayList;

public class ArrayListTest
{
    /*
     * Revisar la documentación de la clase ArrayList
     * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
     */

    public static void main(String args[]) {
        
        //Crear una instancia de ArrayList con "cero" elementos
        ArrayList colores = new ArrayList();
        
        //Se agregan valores iniciales al vector
        colores.add("Rojo");
        colores.add("Blanco");
        colores.add("Amarillo");
        colores.add("Negro");
        colores.add("Azul"); 
        
        //Explicar el método "toString" de los vectores
        System.out.println("Colores: " + colores);        
        
        //Primer operación "add"
        colores.add("Rosa");
        System.out.println("Colores: " + colores);

        //Segunda operación "set"
        colores.set(3, "Verde");
        System.out.println("Colores: " + colores);        
                
        //Tercera operación "remove"
        colores.remove(1);
        System.out.println("Colores: " + colores);  
        
        //Cuarta operación "get"
        String color = (String) colores.get(4);
        System.out.println("Color: " + color);
    }
}