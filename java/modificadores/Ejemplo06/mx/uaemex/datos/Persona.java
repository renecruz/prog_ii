package mx.uaemex.datos;

public class Persona {
	
	/* 	Los miembros de una clase pueden tener 4 modificadores de acceso: 
			default (implícito si no se especifíca nada)
			public
			private
			protected
	*/
	
	private String nombre;
	private int edad;
	private float estatura;
	
	private void imprimeInfo() {
		System.out.println("*** Datos ***\n" + 
											 "Nombre: " + nombre + "\n" +
											 "Edad: " + edad  + "\n" +
											 "Estatura: " + estatura
		);
	}
}

