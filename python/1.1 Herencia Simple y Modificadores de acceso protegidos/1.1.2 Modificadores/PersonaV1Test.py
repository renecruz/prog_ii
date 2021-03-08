class PersonaV1:
  nombre = ""
  edad = 0
  estatura = 0.0
  
  def __str__(self):
    return f"[nombre='{self.nombre}', edad='{self.edad}', estatura='{self.estatura}']"

# Uso de la clase Persona
if __name__ == "__main__":
  persona = PersonaV1();
  persona.nombre = "Fernando López";
  persona.edad = 22;
  persona.estatura = 1.7;
  
  print(persona);
  # [nombre='Fernando López', edad='22', estatura='1.7']