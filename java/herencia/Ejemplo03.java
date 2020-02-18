public class Ejemplo03 {
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.nombre = "Juan Pérez López";
		persona1.edad = 34;
		persona1.estatura = 1.70f;
		persona1.sexo = 'M';
		persona1.imprimirDatos();
		
		Persona persona2 = new Persona();
		persona2.nombre = "María Ruíz Fernández";
		persona2.edad = 25;
		persona2.estatura = 1.63f;
		persona2.sexo = 'F';
		persona2.imprimirDatos();
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