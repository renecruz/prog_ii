#include <iostream>

using namespace std;

class CalculadoraV5 {
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

    double sumar(string a, string b, char tipo) {
      if (tipo == 'i') {
        return (stoi(a) + stoi(b));
      } else if (tipo == 'd'){
        return (stod(a) + stod(b));  
      } else {
        return 0.0;
      }
    }   
};

int main(int argc, char const *argv[])
{
  CalculadoraV5 calculadora = CalculadoraV5();
  cout << "La suma de 3 + 6 es: "     << calculadora.sumar(3, 6) << endl; // OK 👍🏼
  cout << "La suma de 2.5 + 9.2 es: " << calculadora.sumar(2.5, 9.2) << endl; // OK 👍🏼
  cout << "La suma de 3 + 6 es: "     << calculadora.sumar("3","6") << endl; // OK 👍🏼
  cout << "La suma de 2.5 + 9.2 es: " <<  calculadora.sumar("2.5","9.2", 'd') << endl; // OK 👍🏼
  return 0;
}