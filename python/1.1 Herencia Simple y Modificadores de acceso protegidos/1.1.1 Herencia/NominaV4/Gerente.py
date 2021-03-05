from Persona import Persona


class Gerente(Persona):
    def __init__(self, nombre, edad, estatura, sucursal):
        Persona.__init__(self, nombre, edad, estatura)
        self.sucursal = sucursal

    def getsucursal(self):
        return self.sucursal

    def comisionPorVenta(self, ventasTotales):
        print(
            "Ha ganado una porcentaje del: " +
            (ventasTotales * 0.10)
        )  # 10% de la ventas totales

    def __str__(self):
        return Persona.__str__(self) + f", sucursal = '{self.sucursal}'"
