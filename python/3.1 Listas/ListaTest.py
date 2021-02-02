class Nodo:

    def __init__(self,  dato,  nodo):
        self.dato = dato
        self.nodo = nodo

    def toString(self):
        return (f"Dato: {dato}, Nodo -> {nodo}")


class ListaSimple:
    lista = None

    def insertar(self, dato):
        print(f"Insertando: {dato}")
        nuevoNodo = Nodo(dato, None)
        if (self.lista != None):
            aux1 = self.lista
            aux2 = None

            while ((aux1 != None) and (aux1.dato < dato)):
                aux2 = aux1
                aux1 = aux1.nodo

            if (self.lista == aux1):
                self.lista = nuevoNodo
            else:
                aux2.nodo = nuevoNodo

            nuevoNodo.nodo = aux1

        else:
            self.lista = nuevoNodo

    def verLista(self):
        if (self.lista != None):
            nodoActual = self.lista
            print("Lista: [", end=""),
            while (nodoActual != None):
                print(f"{nodoActual.dato},", end=""),
                nodoActual = nodoActual.nodo
            print("\b]")
        else:
            print("Lista vacía")

    def buscar(self, dato):
        fueEncontrado = False
        nodoBuscado = self.lista

        while ((nodoBuscado != None) and (nodoBuscado.dato <= dato)):
            if (nodoBuscado.dato == dato):
                fueEncontrado = True
            nodoBuscado = nodoBuscado.nodo

        print(f"El dato {dato}" + (" Si " if (fueEncontrado)
                                   else " No ") + "se encuentra en la lista")

    def eliminar(self, dato):
        if (self.lista != None):
            nodoEliminar = self.lista
            nodoAnterior = None

            while ((nodoEliminar != None) and (nodoEliminar.dato != dato)):
                nodoAnterior = nodoEliminar
                nodoEliminar = nodoEliminar.nodo

            if (nodoEliminar == None):
                print(f"El dato {dato} no existe")
            elif (nodoAnterior == None):
                self.lista = self.lista.nodo
                print(f"El dato {dato} se ha eliminado")
            else:
                nodoAnterior.nodo = nodoEliminar.nodo
                print(f"El dato {dato} se ha eliminado")

    def vaciarLista(self):
        self.lista = None
        print("La lista se ha vaciado")


# Uso de la clase Lista
if __name__ == "__main__":
    lista = ListaSimple()
    lista.verLista()
    lista.insertar(666)
    lista.insertar(1)
    lista.verLista()
    lista.insertar(1000)
    lista.insertar(500)
    lista.verLista()
    lista.buscar(3)
    lista.eliminar(500)
    lista.verLista()
    lista.vaciarLista()
    lista.verLista()

''' Salida en Consola: 
	
    Lista vacía
    Insertando: 666
    Insertando: 1
    Lista: [1,666]
    Insertando: 1000
    Insertando: 500
    Lista: [1,500,666,1000]
    El dato 3 No se encuentra en la lista
    El dato 500 se ha eliminado
    Lista: [1,666,1000]
    La lista se ha vaciado
    Lista vacía
'''
