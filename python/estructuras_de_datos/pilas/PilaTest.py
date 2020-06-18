class Nodo:

    def __init__(self,  dato,  nodo):
        self.dato = dato
        self.nodo = nodo


class Pila:
    pila = None

    def push(self, dato):
        print (f"Insertando: {dato}")
        nuevoNodo = Nodo(dato, None)
        if (self.pila != None):
            nuevoNodo.nodo = self.pila
            self.pila = nuevoNodo
        else:
            self.pila = nuevoNodo

    def pop(self):
        if (self.pila != None):
            print (f"Quitando: {self.pila.dato}")
            self.pila = self.pila.nodo

    def verPila(self):
        if (self.pila != None):
            nodoActual = self.pila
            print("Pila: [", end=""),
            while (nodoActual != None):
                print(f"{nodoActual.dato},", end=""),
                nodoActual = nodoActual.nodo
            print("\b]")
        else:
            print("Pila vacía")

    def vaciarPila(self):
        self.pila = None
        print("La Pila se ha vaciado")


# Uso de la clase Pila
if __name__ == "__main__":
    pila = Pila()
    pila.verPila()
    pila.push(666)
    pila.push(1)
    pila.verPila()
    pila.push(1000)
    pila.push(500)
    pila.verPila()
    pila.pop()
    pila.verPila()
    pila.vaciarPila()
    pila.verPila()

''' Salida en consola: 

    Pila vacía
    Insertando: 666
    Insertando: 1
    Pila: [1,666]
    Insertando: 1000
    Insertando: 500
    Pila: [500,1000,1,666]
    Quitando: 500
    Pila: [1000,1,666]
    La Pila se ha vaciado
    Pila vacía
'''
