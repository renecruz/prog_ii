package mx.uaemex.test;

/* 	Como la clase que queremos usar esta en otro paquete
		se debe "importar" usando la sintaxis: nombre.del.paquete.Clase */
import mx.uaemex.datos.Persona;

public class PersonaTest {
	
	public static void main(String[] args) {
		Persona luis = new Persona();
		luis.nombre = "Luis López Ruíz";
		luis.edad = 34;
		luis.estatura = 1.75f;
		luis.imprimeInfo();
	}
	
}