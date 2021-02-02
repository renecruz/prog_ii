#include <iostream>

using namespace std;

void mezclar(int arr[], int izquierda[], int sizeIzq, int derecha[], int sizeDer) {
	int indiceIzq = 0, indiceDer = 0, indiceArr = 0;

	// Copia y ordena los elementos de los arreglos izquierda[] and derecha[] 
	while (indiceIzq < sizeIzq && indiceDer < sizeDer)
	{
		if (izquierda[indiceIzq] < derecha[indiceDer])
		{
			arr[indiceArr] = izquierda[indiceIzq];
			indiceIzq += 1;
		}
		else
		{
			arr[indiceArr] = derecha[indiceDer];
			indiceDer += 1;
		}
		indiceArr += 1;
	}

	// verifica si aun hay elementos en alguna de las mitades
	while (indiceIzq < sizeIzq)
	{
		arr[indiceArr] = izquierda[indiceIzq];
		indiceIzq += 1;
		indiceArr += 1;
	}

	while (indiceDer < sizeDer)
	{
		arr[indiceArr] = derecha[indiceDer];
		indiceDer += 1;
		indiceArr += 1;
	}
}

void ordenar(int arr[], int arr_size) {
	if (arr_size > 1) {
		int mitad = arr_size / 2;
		int n1 = mitad;
		int n2 = arr_size - mitad;
		
		// Crea arreglos temporales para las dos mitades
		int izquierda[n1];
		int derecha[n2];

		// Copia los elementos que corresponden en cada mitad
		for (int indiceIzq = 0; indiceIzq < n1; ++indiceIzq) 
			izquierda[indiceIzq] = arr[indiceIzq];
			
		for (int indiceDer = 0; indiceDer < n2; ++indiceDer) 
			derecha[indiceDer] = arr[mitad + indiceDer];
			
		ordenar(izquierda, n1); // Ordena la primera mitad 
		ordenar(derecha, n2); // Ordena la segunda mitad
		mezclar(arr, izquierda, n1, derecha, n2); // Mezcla las dos mitades
	}
}

int main() {
	int datos[] = {8, 5, 3, 9, 1, 4, 7};
	int datos_size = sizeof(datos) / sizeof(datos[0]);
	
	cout << "Arreglo original: [";
	copy(begin(datos), end(datos), ostream_iterator<int>(cout, ","));
	cout << "\b]" << endl;

	ordenar(datos, datos_size);

	cout << "Arreglo ordenado: [";
	copy(begin(datos), end(datos), ostream_iterator<int>(cout, ","));
	cout << "\b]" << endl;

	return 0;
}

