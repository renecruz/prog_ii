package mx.uaemex.data;

public class Persona
{
    private String nombre;
    private int edad;
    private float estatura;
    
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
    public float getEstatura() {
        return estatura;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setNombre(String nombre) {
        //Verificar que nombre contenga al menos 2 caracteres
        //En caso contrario, escribir en consola:
        //"Error en el nombre, debe tener al menos 2 letras"
        if ( nombre.length() < 2) {
            System.out.println("Error en el nombre, debe tener al menos 2 letras");
            this.nombre = "-Indefinido-";
        } else {
            this.nombre = nombre;
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void verInfo() {
        System.out.println("Datos:\n" + 
            "Nombre: " + nombre + "\n" + 
            "Edad: " + edad + "\n" + 
            "Estatura: " + estatura);
    }
}
