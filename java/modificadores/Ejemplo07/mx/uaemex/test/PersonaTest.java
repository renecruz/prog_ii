package mx.uaemex.test;

public class PersonaTest {
	
	public static void main(String[] args) {
		Empleado obj = new Empleado();
	}
	
}

class Empleado extends mx.uaemex.datos.Persona {
	
	// Uso del constructor para acceder a cada miembro de la clase Persona
	Empleado() {
		nombre = "Luis López Ruíz";
		edad = 34;
		estatura = 1.75f;
		imprimeInfo();	
	}
	
}