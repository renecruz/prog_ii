from Persona import Persona


class Vendedor(Persona):
    def __init__(self, nombre, edad, estatura, departamento):
        Persona.__init__(self, nombre, edad, estatura)
        self.departamento = departamento

    def getDepartamento(self):
        return self.departamento

    def comisionPorVenta(self, montoVenta):
        print("Ha ganado una porcentaje del: " +
              (montoVenta * 0.10))  # 10% de la venta

    def __str__(self):
        return Persona.__str__(self) + f", departamento = '{self.departamento}'"
