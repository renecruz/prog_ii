class ListaSimple {

	Nodo lista = null;

	void insertar(int dato) {
		System.out.println("Insertando: " + dato);
		Nodo nuevoNodo = new Nodo(dato, null);
		if (lista != null) {
			Nodo aux1 = lista;
			Nodo aux2 = null;

			while ((aux1 != null) && (aux1.dato < dato)) {
				aux2 = aux1;
				aux1 = aux1.nodo;
			}

			if (lista.equals(aux1)) {
				lista = nuevoNodo;
			} else {
				aux2.nodo = nuevoNodo;
			}

			nuevoNodo.nodo = aux1;
		} else {
			lista = nuevoNodo;
		}
	}

	void verLista() {
		if (lista != null) {
			Nodo actual = lista;
			System.out.print("Lista: [");
			while (actual != null) {
				System.out.print(actual.dato + ",");
				actual = actual.nodo;
			}
			System.out.println("\b]");
		} else {
			System.out.println("Lista vacía");
		}
	}

	void buscar(int dato) {
		boolean fueEncontrado = false;
		Nodo nodoBuscado = lista;

		while ((nodoBuscado != null) && (nodoBuscado.dato <= dato)) {
			if (nodoBuscado.dato == dato) {
				fueEncontrado = true;
			}
			nodoBuscado = nodoBuscado.nodo;
		}

		/*
		 * if (fueEncontrado) { System.out.println("El dato " + dato +
		 * " Si se encuentra en la lista"); } else { System.out.println("El dato " +
		 * dato + " No se encunetra en la lista"); }
		 */
		System.out.println("El dato " + dato + ((fueEncontrado) ? " Si " : " No ") + "se encuentra en la lista");

	}

	void eliminar(int dato) {
		if (lista != null) {
			Nodo nodoEliminar = lista;
			Nodo nodoAnterior = null;

			while ((nodoEliminar != null) && (nodoEliminar.dato != dato)) {
				nodoAnterior = nodoEliminar;
				nodoEliminar = nodoEliminar.nodo;
			}

			if (nodoEliminar == null) {
				System.out.println("El dato " + dato + " no existe");
			} else if (nodoAnterior == null) {
				lista = lista.nodo;
				System.out.println("El dato " + dato + " se ha eliminado");
			} else {
				nodoAnterior.nodo = nodoEliminar.nodo;
				System.out.println("El dato " + dato + " se ha eliminado");
			}
		}
	}

	void vaciarLista() {
		lista = null;
		System.out.println("La lista se ha vaciado");
	}
}

class Nodo {

	int dato;
	Nodo nodo;

	public Nodo(int dato, Nodo nodo) {
		this.dato = dato;
		this.nodo = nodo;
	}

}

public class ListaTest {

	public static void main(String[] args) {
		ListaSimple lista = new ListaSimple();
		lista.verLista();
		lista.insertar(666);
		lista.insertar(1);
		lista.verLista();
		lista.insertar(1000);
		lista.insertar(500);
		lista.verLista();
		lista.buscar(3);
		lista.eliminar(500);
		lista.verLista();
		lista.vaciarLista();
		lista.verLista();
	}
}

/*  Salida en consola:

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
 */