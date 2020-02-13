public class Ejemplo02 {
	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.nombre = "Juan Pérez López";
		persona.edad = 34;
		persona.estatura = 1.70f;
		persona.sexo = 'M';
		persona.imprimirDatos();
	}
}

class Persona {
	String nombre;
	int edad;
	float estatura;
	char sexo;
	
	void imprimirDatos() {
		System.out.println( "Nombre: " + nombre + "\n" +
							"Edad: " + edad + "\n" +
							"Estatura: " + estatura + "\n" +
							"Sexo: " + sexo
		);
	}
}