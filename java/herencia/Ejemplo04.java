
public class Ejemplo04 {

  public Ejemplo04() {
    Alumno alumno1 = new Alumno();
    alumno1.imprimeDatos();
  }
   
  public static void main(String[] args) {
    new Ejemplo04();
  }

  class Alumno extends Persona {

    String matricula = "123456789";
    int semestre = 2;
    float promedioGeneral = 8.7f;

    public Alumno() {
      nombre = "Juan López Delgado";
      edad = 20;
      estatura = 1.70f;
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
    String nombre;
    int edad;
    float estatura;
  }
}
