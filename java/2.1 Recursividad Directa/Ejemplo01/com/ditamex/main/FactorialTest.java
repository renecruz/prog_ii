package com.ditamex.main;


public class FactorialTest
{
    public FactorialTest() {
        int num = 5;
        System.out.println("Factorial de " + num + " es: " + factorial(num));
    }
    
    private int factorial(int n) {
        if (n == 0) { // Caso base 
            return 1;
        } else { // Caso recursivo
            return n*factorial(n-1);
        }
    }
    
    public static void main(String args[]){
        new FactorialTest();
    }
}
