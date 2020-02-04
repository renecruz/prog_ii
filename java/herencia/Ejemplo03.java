
public class Ejemplo03 {

  public Ejemplo03() {
    Alumno alumno1 = new Alumno();
    alumno1.imprimeDatos();
  }
   
  public static void main(String[] args) {
    new Ejemplo03();
  }

  class Alumno extends Persona {

    String matricula = "123456789";
    int semestre = 2;
    float promedioGeneral = 8.7f;

    void imprimeDatos() {
      System.out.println("** Datos del alumno ** \n" + 
          "Nombre: " + nombre + "\n" +
          "Edad: " + edad + "\n" +
          "Estatura: " + estatura + "\n" +
          "Matricula: " + matricula + "\n" +
          "Semestre: " + semestre + "\n" +
          "Promedio General: " + promedioGeneral);
    }
    
  }
  
  class Persona {
    String nombre = "Juan López Delgado";
    int edad = 20;
    float estatura = 1.70f;
  }
}
