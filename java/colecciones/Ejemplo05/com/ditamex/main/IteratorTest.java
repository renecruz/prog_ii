package com.ditamex.main;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest
{
    /*
     * Referirse a la documentación de las interfaces Iterable e Iterator
     * https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
     * https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html
     */
    
    public IteratorTest() {
        ArrayList<String> colores = new ArrayList<String>();
        
        colores.add("Rojo");
        colores.add("Blanco");
        colores.add("Amarillo");
        colores.add("Negro");
        colores.add("Azul"); 
                
        System.out.println("- Colores antes de la eliminación -");
        for (String color: colores) {
            System.out.println(color);
        }
        
        // //Version de eliminación con Iterable.remove(o)
        // for (String color: colores) {
            // if (color.equals("Amarillo")) {
                // colores.remove(color);
            // }
        // }
        
        Iterator<String> it = colores.iterator();
        while (it.hasNext()){
            String color = it.next();
            if (color.equals("Amarillo")) {
                it.remove();
            }
        }
        
        System.out.println("- Colores despues de la eliminación -");
        for (String color: colores) {
            System.out.println(color);
        }
                
    }
    
    public static void main(String args[]) {
        new IteratorTest();
    }
}
