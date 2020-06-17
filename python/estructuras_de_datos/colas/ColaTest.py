class Nodo:

    def __init__(self,  dato,  siguiente, anterior):
        self.dato = dato
        self.siguiente = siguiente
        self.anterior = anterior


class Cola:
    cola = None

    def push(self, dato):
        print (f"Insertando: {dato}")
        nuevoNodo = Nodo(dato, None, None)
        if (self.cola != None):
            nuevoNodo.siguiente = self.cola
            self.cola.anterior = nuevoNodo
            self.cola = nuevoNodo
        else:
            self.cola = nuevoNodo
            self.frente = nuevoNodo

    def pull(self):
        if (self.cola != None):
            print (f"Quitando: {self.frente.dato}")
            self.frente = self.frente.anterior
            self.frente.siguiente = None

    def vercola(self):
        if (self.cola != None):
            nodoActual = self.cola
            print("Cola: [", end=""),
            while (nodoActual != None):
                print(f"{nodoActual.dato},", end=""),
                nodoActual = nodoActual.siguiente
            print("\b]")
        else:
            print("Cola vacía")

    def vaciarcola(self):
        self.cola = None
        print("La cola se ha vaciado")


# Uso de la clase cola
if __name__ == "__main__":
    cola = Cola()
    cola.vercola()
    cola.push(666)
    cola.push(1)
    cola.vercola()
    cola.push(1000)
    cola.push(500)
    cola.vercola()
    cola.pull()
    cola.vercola()
    cola.vaciarcola()
    cola.vercola()

''' Salida en consola: 

    Cola vacía
    Insertando: 666
    Insertando: 1
    Cola: [1,666]
    Insertando: 1000
    Insertando: 500
    Cola: [500,1000,1,666]
    Quitando: 666
    Cola: [500,1000,1]
    La cola se ha vaciado
    Cola vacía
'''
