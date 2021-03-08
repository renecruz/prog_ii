class PersonaV2:
  nombre = ""
  edad = 0
  estatura = 0.0
  
  def __str__(self):
    return f"[nombre='{self.nombre}', edad='{self.edad}', estatura='{self.estatura}']"

# Uso de la clase Persona
if __name__ == "__main__":
  persona = PersonaV2();
  persona.nombre = "";
  persona.edad = -4;
  persona.estatura = 313.0;
  
  print(persona);
  # [nombre='', edad='-4', estatura='313.0']