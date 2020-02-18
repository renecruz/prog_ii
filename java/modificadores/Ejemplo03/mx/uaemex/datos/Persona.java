package mx.uaemex.datos;

// Esta clase tiene el modificador de acceso "Default" y es implícito
class Persona {
	
	String nombre;
	int edad;
	float estatura;
	
	void imprimeInfo() {
		System.out.println("*** Datos ***\n" + 
											 "Nombre: " + nombre + "\n" +
											 "Edad: " + edad  + "\n" +
											 "Estatura: " + estatura
		);
	}
}