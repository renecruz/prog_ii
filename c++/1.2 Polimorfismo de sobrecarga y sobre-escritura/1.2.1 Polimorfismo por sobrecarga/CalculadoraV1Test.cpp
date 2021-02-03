#include <iostream>

using namespace std;

class CalculadoraV1 {
  public:
    int sumar(int a, int b) {
      return (a+b);
    }
};

int main(int argc, char const *argv[])
{
  CalculadoraV1 calculadora = CalculadoraV1();
  cout << "La suma de 3 + 6 es: " << calculadora.sumar(3, 6) << endl; // OK 👍🏼
  cout << "La suma de 2.5 + 9.2 es: " <<  calculadora.sumar(2.5, 9.2) << endl; //Warning: implicit conversion from 'double' to 'int' 😧

  return 0;
}