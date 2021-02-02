#include <iostream>

using namespace std;
int main(int argc, char *argv[]) {
	int datos[] = {8,5,3,9,1};
	
	cout << "Arreglo original: [";
	copy(begin(datos), end(datos), ostream_iterator<int>(cout, ","));
	cout << "\b]" << endl;
	
	int length = sizeof(datos) / sizeof(datos[0]);
	
	for (int recorrido = 1; recorrido < length; recorrido++) {
		int buffer = datos[recorrido];
		int indice = recorrido;
		
		while ( (indice > 0) && (datos[indice - 1] > buffer)) {
			datos[indice] = datos[indice - 1] ;
			indice--;
		}
		datos[indice] = buffer;
	}
	
	cout << "Arreglo ordenado: [";
	copy(begin(datos), end(datos), ostream_iterator<int>(cout, ","));
	cout << "\b]";
	
	return 0;
}

