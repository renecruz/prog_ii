#include <iostream>

using namespace std;

bool esPar(int n); //Declaración de la función
bool esImpar(int n); //Declaración de la función

bool esPar(int n) { //Implementación de la función
	if (n == 0) {
		return true;
	} else {
		return esImpar(n-1);
	}
}

bool esImpar(int n) { //Implementación de la función
	if (n == 0) {
		return false;
	} else {
		return esPar(n-1);
	}
}

int main(int argc, char *argv[]) {
	int numero = 6;
	cout << numero << " es: " << (esPar(numero)?"Par":"Impar") << endl;
}