#include <iostream>

using namespace std;

class CalculadoraV3 {
  public:
    int sumar(int a, int b) {
      return (a+b);
    }

    double sumar(double a, double b) {
      return (a+b);
    }

    int sumar(string a, string b) {
    return (stoi(a) + stoi(b));
  }
};

int main(int argc, char const *argv[])
{
  CalculadoraV3 calculadora = CalculadoraV3();
  cout << "La suma de 3 + 6 es: "     << calculadora.sumar(3, 6) << endl; // OK 👍🏼
  cout << "La suma de 2.5 + 9.2 es: " << calculadora.sumar(2.5, 9.2) << endl; // OK 👍🏼
  cout << "La suma de 3 + 6 es: "     << calculadora.sumar("3","6") << endl; // OK 👍🏼
  cout << "La suma de 2.5 + 9.2 es: " <<  calculadora.sumar("2.5","9.2") << endl; //C++ reduce decimales automáticamente 😵
  return 0;
}