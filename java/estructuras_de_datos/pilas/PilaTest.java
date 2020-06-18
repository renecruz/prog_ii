class Pila {
  Nodo pila = null;

  void push(int dato) { // Apilar o insertar
    System.out.println("Insertando: " + dato);
    Nodo nuevoNodo = new Nodo(dato, null);
    if (pila != null) {
      nuevoNodo.nodo = pila;
      pila = nuevoNodo;
    } else {
      pila = nuevoNodo;
    }
  }

  void pop() { // Retirar o Quitar
    
    if (pila != null) {
      System.out.println("Quitando: " + pila.dato);
      pila = pila.nodo;
    }
  }

  void verPila() {
    if (pila != null) {
      Nodo actual = pila;
      System.out.print("Pila: [");
      while (actual != null) {
        System.out.print(actual.dato + ",");
        actual = actual.nodo;
      }
      System.out.println("\b]");
    } else {
      System.out.println("Pila vacía");
    }
  }

  void vaciarPila() {
    pila = null;
    System.out.println("La pila se ha vaciado");
  }
}

class Nodo {

  int dato;
  Nodo nodo;

  public Nodo(int dato, Nodo nodo) {
    this.dato = dato;
    this.nodo = nodo;
  }

}

public class PilaTest {
  public static void main(String[] args) {
    Pila pila = new Pila();
    pila.verPila();
    pila.push(666);
    pila.push(1);
    pila.verPila();
    pila.push(1000);
    pila.push(500);
    pila.verPila();
    pila.pop();
    pila.verPila();
    pila.vaciarPila();
    pila.verPila();
  }
}


/*  Salida en consola: 

/*  Salida en consola: 

		Pila vacía
    Insertando: 666
    Insertando: 1
    Pila: [1,666]
    Insertando: 1000
    Insertando: 500
    Pila: [500,1000,1,666]
    Quitando: 500
    Pila: [1000,1,666]
    La pila se ha vaciado
    Pila vacía
*/
*/
