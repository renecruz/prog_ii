//Ejemplo para ver el problema de no usar/implementar herencia
//Hay código repetido/redundante (evitar siempre que se pueda!)

public class Ejemplo05 {
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.nombre = "Juan Pérez López";
		persona1.edad = 34;
		persona1.estatura = 1.70f;
		persona1.sexo = 'M';
		persona1.imprimirDatos();
		
		Empleado empleado1 = new Empleado();
		empleado1.nombre = "Daniel Vázquez Luna";
		empleado1.edad = 40;
		empleado1.estatura = 1.81f;
		empleado1.sexo = 'M';
		empleado1.depto = "Electrónica";
		empleado1.turno = 'V';
		empleado1.sueldo = 8000.0f;
		empleado1.imprimirDatos();
		
		Gerente gerente1 = new Gerente();
		gerente1.nombre = "Eva Juárez Hernández";
		gerente1.edad = 45;
		gerente1.estatura = 1.68f;
		gerente1.sexo = 'F';
		gerente1.sucursal = "Chalco";
		gerente1.sueldo = 15000.0f;
		gerente1.imprimirDatos();
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

class Empleado {
	String nombre;
	int edad;
	float estatura;
	char sexo;
	String depto;
	char turno;
	float sueldo;
	
	void imprimirDatos() {
		System.out.println( "Nombre: " + nombre + "\n" +
							"Edad: " + edad + "\n" +
							"Estatura: " + estatura + "\n" +
							"Sexo: " + sexo + "\n" + 
							"Depto: " + depto  + "\n" + 
							"Turno: " + turno  + "\n" + 
							"Sueldo: $" + sueldo
		);
	}
}

class Gerente {
	String nombre;
	int edad;
	float estatura;
	char sexo;
	String sucursal;	
	float sueldo;
	
	void imprimirDatos() {
		System.out.println( "Nombre: " + nombre + "\n" +
							"Edad: " + edad + "\n" +
							"Estatura: " + estatura + "\n" +
							"Sexo: " + sexo + "\n" + 
							"Sucursal: " + sucursal  + "\n" + 							
							"Sueldo: $" + sueldo
		);
	}
}