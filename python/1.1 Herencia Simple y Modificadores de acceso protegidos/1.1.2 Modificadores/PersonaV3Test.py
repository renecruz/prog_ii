class PersonaV3:
  # atributos privados (su nombre inicia con dos guiones bajos)
  __nombre = ""
  __edad = 0
  __estatura = 0.0
  
  def getNombre(self): 
    return self.__nombre

  def setNombre(self, nombre): 
    self.__nombre = nombre

  def getEdad(self): 
    return self.__edad

  def setEdad(self, edad):
    self.__edad = edad

  def getEstatura(self): 
    return self.__estatura

  def setEstatura(self, estatura):
    self.__estatura = estatura
  
  def __str__(self):
    return f"[nombre='{self.__nombre}', edad='{self.__edad}', estatura='{self.__estatura}']"

# Uso de la clase Persona
if __name__ == "__main__":
  persona = PersonaV3()
  persona.setNombre("")
  persona.setEdad(-4)
  persona.setEstatura(313.0)
  
  print(persona)
  # [nombre='', edad='-4', estatura='313.0']