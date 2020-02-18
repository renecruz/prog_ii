package mx.uaemex.datos;

public class Persona {
	
	/* 	Los miembros de una clase pueden tener 4 modificadores de acceso: 
			default (implícito si no se especifíca nada)
			public
			private
			protected
	*/
	
	public String nombre;
	public int edad;
	public float estatura;
	
	public void imprimeInfo() {
		System.out.println("*** Datos ***\n" + 
											 "Nombre: " + nombre + "\n" +
											 "Edad: " + edad  + "\n" +
											 "Estatura: " + estatura
		);
	}
}