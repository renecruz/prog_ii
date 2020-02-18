package mx.uaemex.datos;

public class PersonaTest {
	public static void main(String[] args) {
		Persona luis = new Persona();
		luis.nombre = "Luis López Ruíz";
		luis.edad = 34;
		luis.estatura = 1.75f;
		luis.imprimeInfo();
	}
}