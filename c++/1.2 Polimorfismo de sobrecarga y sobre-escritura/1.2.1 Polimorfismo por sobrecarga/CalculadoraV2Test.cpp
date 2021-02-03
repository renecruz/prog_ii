#include <iostream>

using namespace std;

class CalculadoraV2 {
  public:
    int sumar(int a, int b) {
      return (a+b);
    }

    double sumar(double a, double b) {
      return (a+b);
    }
};

int main(int argc, char const *argv[])
{
  CalculadoraV2 calculadora = CalculadoraV2();
  cout << "La suma de 3 + 6 es: "     << calculadora.sumar(3, 6) << endl; // OK 👍🏼
  cout << "La suma de 2.5 + 9.2 es: " << calculadora.sumar(2.5, 9.2) << endl; // OK 👍🏼
  cout << "La suma de 3 + 6 es: "     << calculadora.sumar("3","6") << endl; //Error 😧
  return 0;
}