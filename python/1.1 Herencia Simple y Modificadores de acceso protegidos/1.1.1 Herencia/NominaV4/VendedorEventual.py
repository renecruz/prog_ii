from Vendedor import Vendedor


class VendedorEventual(Vendedor):
    def __init__(self, nombre, edad, estatura, departamento, sueldoPorDia):
        Vendedor.__init__(self, nombre, edad, estatura, departamento)
        self.sueldoPorDia = sueldoPorDia

    def getSueldoPorDia(self):
        return self.sueldoPorDia

    def __str__(self):
        return Vendedor.__str__(self) + f", sueldoPorDia = '{self.sueldoPorDia}'"
