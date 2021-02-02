#include <iostream>

using namespace std;

int busquedaSecuencial(int datos[], int indiceIzq, int indiceDer,  int datoBuscado) {	
		for (int indice = indiceIzq; indice < indiceDer; indice ++)	{
			if (datos[indice] == datoBuscado) {
				return indice;
			}
		}
		return -1;
	}

int busquedaBinaria(int datos[],int longitud, int datoBuscado) {
	int mitad = longitud/2; // Mitad del arreglo
	if (datos[mitad] == datoBuscado) {
		return mitad;
	} else if (datoBuscado < datos[mitad]) { // Buscar en la mitad izquierda
		return busquedaSecuencial(datos, 0, mitad, datoBuscado);
	} else { // Buscar en la mitad derecha
		return busquedaSecuencial(datos, mitad + 1, longitud, datoBuscado);
	}
}

int main(int argc, char *argv[]) {
	int datos[] = { 1, 3, 4, 5, 7, 8, 9 };
	int longitud = sizeof(datos) / sizeof(datos[0]);
	int datoBuscado = 8;	
	int indice = busquedaBinaria(datos, longitud, datoBuscado);
	
	cout << "El dato " << datoBuscado;
	if (indice != -1) {
		cout << " está en el índice: " << indice << endl;
	} else {
		cout << " no se encontró" << endl;
	}
}

// Salida en consola: 
// El dato 8 está en el índice: 5
