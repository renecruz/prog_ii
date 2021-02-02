package mx.uaemex.main;


public class ArrayTest
{

    public ArrayTest() {
        char vocales[] = new char[5];
        vocales[0] = 'a';
        vocales[1] = 'e';
        vocales[2] = 'i';
        vocales[3] = 'o';
        vocales[4] = 'u';
        //System.out.println("Vocales: " + vocales);
        System.out.print("Vocales: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vocales[i]);
        }
    }
    
    public static void main(String[] args) {
        new ArrayTest();
    }
}