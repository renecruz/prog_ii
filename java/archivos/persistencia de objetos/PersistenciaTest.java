import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class PersistenciaTest {
  private Scanner sc;
  private PersonaController pc;

  public PersistenciaTest() {
    pc = new PersonaController();
    sc = new Scanner(System.in);
    cargaMenu();

    pc.cerrarArchivo();
  }

  public void cargaMenu() {
    char opcion = ' ';
    do {
      System.out.println("************************");
      System.out.println("*         MENU         *");
      System.out.println("************************");
      System.out.println();
      System.out.println("(C)rear nuevo Persona");
      System.out.println("(V)er una Persona");
      System.out.println("(L)ista de Personas");
      System.out.println("(S)alir");
      System.out.println();
      System.out.print("Digite comando: ");
      opcion = sc.next().charAt(0); // Lee un solo caracter

      opcion = Character.toUpperCase(opcion); // Convierte a MAYUSCULAS el caracter
      switch (opcion) {
        case 'C': {
          crearPersona();
        }
          break;
        case 'V': {
          verPersona();
        }
          break;
        case 'L': {
          listaPersonas();
        }
          break;
      }
    } while (opcion != 'S');
    sc.close();
  }

  public void crearPersona() {

    String nombre;
    int edad;
    float estatura;

    sc.nextLine(); // Limpia el buffer del teclado para poder leer
    System.out.print("Nombre (Max. 40 caracteres): ");
    nombre = sc.nextLine();

    System.out.print("Edad (ej. 32): ");
    edad = sc.nextInt();

    System.out.print("Estatura (ej. 1.75): ");
    estatura = sc.nextFloat();

    Persona p = new Persona(nombre, edad, estatura);
    pc.guardaPersona(p);
  }

  public void verPersona() {
    System.out.println("Registros en el archivo: " + pc.getNumeroDeRegistros());
    sc.nextLine(); // Limpia el buffer del teclado para poder leer
    System.out.print("Numero de registro: ");
    int posicion = sc.nextInt();
    pc.verPersona(posicion);
  }

  public void listaPersonas() {
    pc.listaPersonas();
  }

  public static void main(String[] args) {
    new PersistenciaTest();
  }

}

class PersonaController {

  private int longitudRegistro = 50;
  private int numeroDeRegistros;
  private RandomAccessFile archivo = null;

  public PersonaController() {
    try {
      // se abre el archivo para lectura y escritura (read & write)
      archivo = new RandomAccessFile("datos.dat", "rw");
      // calcula la cantidad de registros en el archivo, redondeando hacia el entero
      // superior proximo (ej. 2.3 -> 3)
      numeroDeRegistros = (int) Math.ceil((double) archivo.length() / (double) longitudRegistro);

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public int getNumeroDeRegistros() {
    return numeroDeRegistros;
  }

  public void guardaPersona(Persona p) {
    if (p.getNombre().length() > 40) {
      System.out.println("ERROR al guardar el registro: Nombre mayor a 40 caracteres");
    } else {
      try {
        // calculamos la siguiente posicion del registro (cada 50 Bytes)
        archivo.seek(numeroDeRegistros * longitudRegistro);
        archivo.writeUTF(p.getNombre()); // 1 Bytes por caracter + 2 Bytes de referencia
        archivo.writeInt(p.getEdad()); // 4 Bytes
        archivo.writeFloat(p.getEstatura()); // 4 Bytes
        numeroDeRegistros++;
        // System.out.println("Tamanio del archivo: " + archivo.length() + " bytes.");
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }

  public void verPersona(int posicion) {
    posicion--;
    if (posicion >= 0 && posicion <= numeroDeRegistros) {
      try {
        archivo.seek(posicion * longitudRegistro);
        Persona p = new Persona(archivo.readUTF(), archivo.readInt(), archivo.readFloat());
        System.out.println(p);
      } catch (Exception e) {
        e.printStackTrace();
      }

    } else {
      System.out.println("Posicion fuera del rango");
    }
  }

  public void listaPersonas() {
    System.out.println("Registros en el archivo: " + numeroDeRegistros);
    for (int i = 0; i < numeroDeRegistros; i++) {
      System.out.print((i + 1) + ": ");
      verPersona(i);
    }
  }

  public void cerrarArchivo() {
    try {
      if (archivo != null) {
        archivo.close();
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}

class Persona {
  private String nombre;
  private int edad;
  private float estatura;

  public Persona(String nombre, int edad, float estatura) {
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getEdad() {
    return this.edad;
  }

  public float getEstatura() {
    return this.estatura;
  }

  @Override
  public String toString() {
    return "{" + " nombre='" + getNombre() + "'" + ", edad='" + getEdad() + "'" + ", estatura='" + getEstatura() + "'"
        + "}";
  }

}