#include <iostream>

using namespace std;

int busquedaSecuencial(int datos[], int longitud,  int datoBuscado) {	
	for (int indice = 0; indice < longitud; indice ++)	{
		if (datos[indice] == datoBuscado) {
			return indice;
		}
	}
	return -1;
}

int main(int argc, char *argv[]) {
	int datos[] = { 8, 5, 3, 9, 1, 4, 7 };
	int longitud = sizeof(datos) / sizeof(datos[0]);
	int datoBuscado = 9;	
	int indice = busquedaSecuencial(datos, longitud, datoBuscado);
	
	cout << "El dato " << datoBuscado;
	if (indice != -1) {
		cout << " está en el índice: " << indice << endl;
	} else {
		cout << " no se encontró" << endl;
	}
}

// Salida en consola: 
// El dato 9 está en el índice: 3
