#include <iostream>

using namespace std;

int main(int argc, char const *argv[])
{
  char vocales[5];
  vocales[0] = 'a';
  vocales[1] = 'e';
  vocales[2] = 'i';
  vocales[3] = 'o';
  vocales[4] = 'u';

  cout << "Vocales: " << endl;
  for (int i = 0; i < 5; i++)
  {
    cout << vocales[i] << endl;
  }
  return 0;
}
