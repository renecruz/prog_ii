import java.io.EOFException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ArchivoAleatorioTest {

  private Scanner sc;

  public ArchivoAleatorioTest() {
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
    RandomAccessFile archivo = null;
    try {
      // se abre el archivo para lectura y escritura (read & write)
      archivo = new RandomAccessFile("datos.dat", "rw");

      archivo.seek(archivo.length()); // nos situamos al final del archivo
      sc.nextLine(); // Limpia el buffer del teclado para poder leer
      System.out.print("Digite su nombre: ");
      archivo.writeUTF(sc.nextLine());

      System.out.print("Edad (ej. 32): ");
      archivo.writeInt(sc.nextInt());

      System.out.print("Estatura (ej. 1.75): ");
      archivo.writeFloat(sc.nextFloat());

    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
      try {
        if (archivo != null) {
          archivo.close();
        }
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }

  }

  public void verRegistros() {
    RandomAccessFile archivo = null;
    try {
      archivo = new RandomAccessFile("datos.dat", "rw");
      archivo.seek(0); // nos situamos al principio
      while (true) {
        System.out.println("Nombre: " + archivo.readUTF());
        System.out.println("Edad: " + archivo.readInt());
        System.out.println("Estatura: " + archivo.readFloat());
      }
    } catch (EOFException ex) {
      System.out.println("Fin del archivo");
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
      try {
        if (archivo != null) {
          archivo.close();
        }
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    new ArchivoAleatorioTest();
  }
}