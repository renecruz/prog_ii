#include <iostream>

using namespace std;
int main(int argc, char *argv[]) {
	int datos[] = {8,5,3,9,1};		
		
	cout << "Arreglo original: [";
	copy(begin(datos), end(datos), ostream_iterator<int>(cout, ","));
	cout << "\b]" << endl;

	int length = sizeof(datos) / sizeof(datos[0]); //Calcula el # de elementos

	for (int recorrido = 0; recorrido < length; recorrido++) {			
		for (int  indice = 0; indice < recorrido; indice++) {
			if (datos[recorrido] < datos[indice]) { // Intercambio
				int buffer = datos[indice];	
				datos[indice] = datos[recorrido];
				datos[recorrido] = buffer;
			}								
		}
	}

	cout << "Arreglo ordenado: [";
	copy(begin(datos), end(datos), ostream_iterator<int>(cout, ","));
	cout << "\b]" << endl;

	return 0;
}