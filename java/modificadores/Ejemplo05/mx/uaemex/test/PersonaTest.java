package mx.uaemex.test;

public class PersonaTest {
	
	public static void main(String[] args) {
		
		/* 	Otra manera de usar una clase contenida en un paquete diferente, es
				especificando su nombre en formato "totalmente cualificado", esto significa
				que se debe anteponer el "nombre.del.paquete" antes del nombre de la clase
				cada que se quiera usar 
		*/
		
		mx.uaemex.datos.Persona luis = new mx.uaemex.datos.Persona();
		luis.nombre = "Luis López Ruíz";
		luis.edad = 34;
		luis.estatura = 1.75f;
		luis.imprimeInfo();
	}
	
}