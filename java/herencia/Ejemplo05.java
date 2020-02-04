
public class Ejemplo05 {

  public Ejemplo05() {
    Alumno alumno1 = new Alumno();
    alumno1.imprimeDatos();
  }
   
  public static void main(String[] args) {
    new Ejemplo05();
  }

  class Alumno extends Persona {

    String matricula = "123456789";
    int semestre = 2;
    float promedioGeneral = 8.7f;

    public Alumno() {
      nombre = "Rosa Castro Miranda";
      edad = 22;
      estatura = 1.56f;
    }
    
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
