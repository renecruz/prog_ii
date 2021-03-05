class Gerente:
    def __init__(self, nombre, edad, estatura, sucursal):
        self.nombre = nombre
        self.edad = edad
        self.estatura = estatura
        self.sucursal = sucursal

    def getNombre(self):
        return self.nombre

    def getEdad(self):
        return self.edad

    def getEstatura(self):
        return self.estatura

    def getsucursal(self):
        return self.sucursal

    def comisionPorVenta(self, ventasTotales):
        print(
            "Ha ganado una porcentaje del: " + (ventasTotales * 0.10)
        )  # 10% de la ventas totales

    def __str__(self):
        return f"nombre='{self.nombre}', edad='{self.edad}', estatura='{self.estatura}', sucursal='{self.sucursal}'"
