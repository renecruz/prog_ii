public class Ejemplo01 {
  
  public static void main(String[] args) {
    SubClase miObjeto = new SubClase();
    miObjeto.dato1 = '@';    
    miObjeto.metodo1();    
  }
}

class SuperClase {
  
  char dato1;
  
  void metodo1() {
    System.out.println("Ejecución del método 1");
  }  
  
}

class SubClase extends SuperClase{}