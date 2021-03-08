class PersonaV4:
  # atributos privados (su nombre inicia con dos guiones bajos)
  __nombre = ""
  __edad = 0
  __estatura = 0.0
  
  def getNombre(self): 
    return self.__nombre

  def setNombre(self, nombre): 
    if not nombre:
      self.__nombre = "Indefinido"
      print("Nombre vacio, verifique")      
    else: 
      self.__nombre = nombre
    
  def getEdad(self): 
    return self.__edad

  def setEdad(self, edad):
    if (edad < 0 or edad > 100):
      self.__edad = 0
      print("No se admiten edades negativas o mayores a 100 años")
    else:
      self.__edad = edad

  def getEstatura(self): 
    return self.__estatura

  def setEstatura(self, estatura):
    if (estatura < 0.5 or estatura > 3.0): 
      self.__estatura = 0.5
      print("No se admiten estaturas menores a 0.5m o mayores a 3.0m")
    else:
      self.__estatura = estatura
  
  def __str__(self):
    return f"[nombre='{self.__nombre}', edad='{self.__edad}', estatura='{self.__estatura}']"

# Uso de la clase Persona
if __name__ == "__main__":
  persona = PersonaV4()
  persona.setNombre("")
  persona.setEdad(-4)
  persona.setEstatura(313.0)
  
  print(persona)
  '''
  Nombre vacio, verifique
  No se admiten edades negativas o mayores a 100 años
  No se admiten estaturas menores a 0.5m o mayores a 3.0m
  [nombre='Indefinido', edad='0', estatura='0.5']
  '''