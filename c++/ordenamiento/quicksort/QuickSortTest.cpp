#include <iostream>

using namespace std;

int ordenarSeccion(int arr[], int indiceIzq, int indiceDer) {
	int pivote = arr[indiceDer]; //Decisión del programador
	int elemento = (indiceIzq - 1);
	for (int indice = indiceIzq; indice < indiceDer; indice++) {
		if (arr[indice] < pivote) { //Intercambio
			elemento++;				
			int buffer = arr[elemento];
			arr[elemento] = arr[indice];
			arr[indice] = buffer;
		}
	}
	elemento++;
	int buffer = arr[elemento];
	arr[elemento] = arr[indiceDer];
	arr[indiceDer] = buffer;

	return elemento;
}

void ordenar(int arr[], int indiceIzq, int indiceDer) {
	if (indiceIzq < indiceDer) {
		int inicio = ordenarSeccion(arr, indiceIzq, indiceDer);
		ordenar(arr, indiceIzq, inicio - 1);
		ordenar(arr, inicio + 1, indiceDer);
	}
}

int main() {
	int datos[] = {8, 5, 3, 9, 1, 4, 7};
	int n = sizeof(datos) / sizeof(datos[0]);

	cout << "Arreglo original: [";
	copy(begin(datos), end(datos), ostream_iterator<int>(cout, ", "));
	cout << "\b\b]" << endl;

	ordenar(datos, 0, n - 1);

	cout << "Arreglo ordenado: [";
	copy(begin(datos), end(datos), ostream_iterator<int>(cout, ", "));
	cout << "\b\b]" << endl;

	return 0;
}

// Salida en consola: 
// Arreglo original: [8, 5, 3, 9, 1, 4, 7]
// Arreglo ordenado: [1, 3, 4, 5, 7, 8, 9]