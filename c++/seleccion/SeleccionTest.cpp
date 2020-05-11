#include <iostream>

using namespace std;
int main(int argc, char *argv[]) {
	int datos[] = {8,5,3,9,1};
		
	cout << "Arreglo original: [";
	copy(begin(datos), end(datos), ostream_iterator<int>(cout, ","));
	cout << "\b]" << endl;
	
	int length = sizeof(datos) / sizeof(datos[0]); //Calcula el # de elementos
	
	for (int indiceOrdenar = 0; indiceOrdenar < length - 1; indiceOrdenar++) {
		int indiceMinimo = indiceOrdenar;
		for (int indiceComparar = indiceOrdenar + 1; indiceComparar < length; indiceComparar++) {
			if ( datos[indiceComparar] < datos[indiceMinimo] ) {
				indiceMinimo = indiceComparar;
			}
		}
		int buffer = datos[indiceOrdenar];
		datos[indiceOrdenar] = datos[indiceMinimo];
		datos[indiceMinimo] = buffer;
	}
			
	cout << "Arreglo ordenado: [";
	copy(begin(datos), end(datos), ostream_iterator<int>(cout, ","));
	cout << "\b]";
	
	return 0;
}