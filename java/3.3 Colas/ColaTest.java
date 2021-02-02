class Cola {
  Nodo cola = null;
  Nodo frente = null;

  void push(int dato) { // Insertar
    System.out.println("Insertando: " + dato);
    Nodo nuevoNodo = new Nodo(dato, null, null);
    if (cola != null) {
      nuevoNodo.siguiente = cola;      
      cola.anterior = nuevoNodo;      
      cola = nuevoNodo;
    } else {
      cola = nuevoNodo;
      frente = nuevoNodo;
    }
    
  }

  void pop() { // Eliminar
    if (cola != null) {   
      System.out.println("Extrayendo: " + frente.dato);   
      frente = frente.anterior;
      frente.siguiente = null;            
    } 
  }

  void verCola() {
    if (cola != null) {
      Nodo nodoActual = cola;
      System.out.print("Cola: [");
      while (nodoActual != null) {
        System.out.print(nodoActual.dato + ",");
        nodoActual = nodoActual.siguiente;
      }
      System.out.println("\b]");
    } else {
      System.out.println("Cola vacía");
    }
  }

  void vaciarCola() {
    cola = null;
    System.out.println("La cola se ha vaciado");
  }
}

class Nodo {

  int dato;
  Nodo siguiente;
  Nodo anterior;

  public Nodo(int dato, Nodo siguiente, Nodo anterior) {
    this.dato = dato;
    this.siguiente = siguiente;
    this.anterior = anterior;
  }
}

public class ColaTest {
  public static void main(String[] args) {
    Cola cola = new Cola();
    cola.verCola();
    cola.push(666);
    cola.push(1);
    cola.verCola();
    cola.push(1000);
    cola.push(500);
    cola.verCola();
    cola.pop();
    cola.verCola();
    cola.vaciarCola();
    cola.verCola();
  }
}


/*  Salida en consola: 

    Cola vacía
    Insertando: 666
    Insertando: 1
    Cola: [1,666]
    Insertando: 1000
    Insertando: 500
    Cola: [500,1000,1,666]
    Extrayendo: 666
    Cola: [500,1000,1]
    La cola se ha vaciado
    Cola vacía
*/