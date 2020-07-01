import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class ArchivoTextoTest {

  private Scanner sc;

  public ArchivoTextoTest() {
    sc = new Scanner(System.in);
    cargaMenu();
  }

  public void cargaMenu() {
    char opcion = ' ';
    do {
      System.out.println("************************");
      System.out.println("*         MENU         *");
      System.out.println("************************");
      System.out.println();
      System.out.println("(C)rear nuevo registro");
      System.out.println("(V)er todos los registros");
      System.out.println("(S)alir");
      System.out.println();
      System.out.print("Digite comando: ");
      opcion = sc.next().charAt(0); // Lee un solo caracter

      opcion = Character.toUpperCase(opcion); // Convierte a MAYUSCULAS el caracter
      switch (opcion) {
        case 'C': {
          crearRegistro();
        }
          break;
        case 'V': {
          verRegistros();
        }
          break;
      }
    } while (opcion != 'S');
    sc.close();
  }

  public void crearRegistro() {
    File f = null;
    FileWriter fw = null;
    PrintWriter pw = null;
    try {
      f = new File("datos.txt");

      // Escritura del archivo
      fw = new FileWriter(f, true); // true = append
      pw = new PrintWriter(fw);

      sc.nextLine(); // Limpia el buffer del teclado para poder leer
      System.out.print("Digite su nombre: ");
      pw.println(sc.nextLine());

      System.out.print("Edad (ej. 32): ");
      pw.println(sc.nextInt());

      System.out.print("Estatura (ej. 1.75): ");
      pw.println(sc.nextFloat());

      if (fw != null) {
        fw.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void verRegistros() {
    File f = null;
    FileReader fr = null;
    try {
      f = new File("datos.txt");
      // Lectura del archivo
      fr = new FileReader(f);
      BufferedReader br = new BufferedReader(fr);
      System.out.println("Contenido del archivo:");
      String linea = null;
      while ((linea = br.readLine()) != null) {
        System.out.println("Nombre: " + linea);
        System.out.println("Edad: " + br.readLine());
        System.out.println("Estatura: " + br.readLine());
      }
      br.close();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (fr != null) {
        try {
          fr.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public static void main(String[] args) {
    new ArchivoTextoTest();
  }
}