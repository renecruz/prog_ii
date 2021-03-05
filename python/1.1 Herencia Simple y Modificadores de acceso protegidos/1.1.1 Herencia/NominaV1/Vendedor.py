class Vendedor:
    def __init__(self, nombre, edad, estatura, departamento):
        self.nombre = nombre
        self.edad = edad
        self.estatura = estatura
        self.departamento = departamento

    def __str__(self):
        return f"nombre='{self.nombre}', edad='{self.edad}', estatura='{self.estatura}', departamento='{self.departamento}'"
        #return f"{self.nombre=}, {self.edad=}, {self.estatura=}, {self.departamento=}"
        #return "{},{},{},{}".format(self.nombre, self.edad, self.estatura, self.departamento)
        

    def getNombre(self):
        return self.nombre

    def getEdad(self):
        return self.edad

    def getEstatura(self):
        return self.estatura

    def getDepartamento(self):
        return self.departamento

    def comisionPorVenta(self, montoVenta):
        print("Ha ganado una porcentaje del: " + (montoVenta * 0.10))  # 10% de la venta
