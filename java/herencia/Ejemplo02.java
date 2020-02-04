public class Ejemplo02 {

  public Ejemplo02() {
    SubClase miObjeto = new SubClase();
    miObjeto.dato1 = '@';
    miObjeto.dato2 = 45;
    miObjeto.dato3 = 1.70f;
    miObjeto.metodo1();
    System.out.println("Metodo 2 devuelve: " + miObjeto.metodo2());
    System.out.println("Metodo 3 devuelve: " + miObjeto.metodo3(4, 11));
  }

  public static void main(String[] args) {
    Ejemplo02 objetoTest = new Ejemplo02();
  }

  class SuperClase {

    char dato1;
    int dato2;
    float dato3;

    void metodo1() {
      System.out.println("Ejecución del método 1");
    }

    int metodo2() {
      return 666;
    }

    float metodo3(int valor1, int valor2) {
      return (float) (valor1 + valor2);
    }
  }

  class SubClase extends SuperClase {
  }
}
