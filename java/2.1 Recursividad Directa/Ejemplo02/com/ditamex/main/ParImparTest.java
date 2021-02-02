package com.ditamex.main;

public class ParImparTest
{
    public ParImparTest() {
        int numero = 6;
        System.out.println(numero + " es: " + (esPar(numero)?"Par":"Impar") );
    }
    
    private boolean esPar(int n) {
        if (n == 0) {
            return true;
        } else {
            return esImpar(n-1);
        }
    }
    
    private boolean esImpar(int n) {
        if (n == 0) {
            return false;
        } else {
            return esPar(n-1);
        }
    }
    
    public static void main(String args[]) {
        new ParImparTest();
    }
}
