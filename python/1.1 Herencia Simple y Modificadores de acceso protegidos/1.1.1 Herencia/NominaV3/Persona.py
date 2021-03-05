class Persona:
    def __init__(self, nombre, edad, estatura):
        self.nombre = nombre
        self.edad = edad
        self.estatura = estatura

    def getNombre(self):
        return self.nombre

    def getEdad(self):
        return self.edad

    def getEstatura(self):
        return self.estatura

    def __str__(self):
        return f"nombre='{self.nombre}', edad='{self.edad}', estatura='{self.estatura}'"
