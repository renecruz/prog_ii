package mx.uaemex.test;

import mx.uaemex.data.Persona;

public class PersonaTest
{
    Persona persona1;
    
    public PersonaTest() {
        persona1 = new Persona();
        persona1.setNombre("J");
        persona1.setEdad(-2);
        persona1.setEstatura(30.75f);
        persona1.verInfo();
    }
}
