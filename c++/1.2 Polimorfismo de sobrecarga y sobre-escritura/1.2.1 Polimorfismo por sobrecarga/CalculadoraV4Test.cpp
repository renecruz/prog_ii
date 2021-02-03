#include <iostream>

using namespace std;

class CalculadoraV4 {
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

    double sumar(string a, string b) {
      return (stod(a) + stod(b));  
    }
    //Error: functions that differ only in their return type cannot be overloaded 😵
};

int main(int argc, char const *argv[])
{
  CalculadoraV4 calculadora = CalculadoraV4();
  cout << "La suma de 3 + 6 es: "     << calculadora.sumar(3, 6) << endl; // OK 👍🏼
  cout << "La suma de 2.5 + 9.2 es: " << calculadora.sumar(2.5, 9.2) << endl; // OK 👍🏼
  cout << "La suma de 3 + 6 es: "     << calculadora.sumar("3","6") << endl; // OK 👍🏼
  cout << "La suma de 2.5 + 9.2 es: " <<  calculadora.sumar("2.5","9.2") << endl; //C++ reduce decimales automáticamente 👍🏼
  return 0;
}