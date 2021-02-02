#include <iostream>

using namespace std;

int factorial(int n) {
	if (n == 0) { // Caso base 
		return 1;
	} else { // Caso recursivo
		return n*factorial(n-1);
	}
}

int main(int argc, char *argv[]) {
	int num = 5;
	cout << "Factorial de " << num << " es: " << factorial(num) <<endl;
}

