package mx.uaemex.datos;

// Las clases solo pueden tener dos modificadores de acceso: default o public
public class PersonaTest {
	
	public static void main(String[] args) {
		Persona luis = new Persona();
		luis.nombre = "Luis López Ruíz";
		luis.edad = 34;
		luis.estatura = 1.75f;
		luis.imprimeInfo();
	}
	
}