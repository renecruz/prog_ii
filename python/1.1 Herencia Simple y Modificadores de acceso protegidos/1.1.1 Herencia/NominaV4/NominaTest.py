# -*- coding: utf-8 -*-
from VendedorEventual import VendedorEventual
from Vendedor import Vendedor
from Gerente import Gerente

# Uso de la clase Vendedor
if __name__ == "__main__":
    vendedor = Vendedor("Julio Mancera Castro", 32, 1.73, "Electrónica")
    print(vendedor)
    gerente = Gerente("Maribel Estrada Contreras", 34, 1.70, "Chalco")
    print(gerente)
    vendedorE = VendedorEventual("Rosa Castro Luján", 25, 1.75, "Ropa", 200.0)
    print(vendedorE)
