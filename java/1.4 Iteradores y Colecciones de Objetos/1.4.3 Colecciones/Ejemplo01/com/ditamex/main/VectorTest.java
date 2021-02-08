package com.ditamex.main;

import java.util.Vector;

public class VectorTest
{
    public static void main(String args[]) {
        /* 
         * Revisar la documentación de la clase Vector
         * https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html
         */
        
        //Se inicializa el vector con "cero" elementos
        Vector colores = new Vector();
        
        //Se agregan valores iniciales al vector
        colores.add("Rojo");
        colores.add("Blanco");
        colores.add("Amarillo");
        colores.add("Negro");
        colores.add("Azul"); 
                
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