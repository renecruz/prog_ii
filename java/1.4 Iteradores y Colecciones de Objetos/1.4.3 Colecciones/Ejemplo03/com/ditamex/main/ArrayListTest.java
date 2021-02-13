import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    /*
     * Revisar la documentación de la clase Collections
     * https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html
     */

    public static void main(String args[]) {
        ArrayList<String> colores = new ArrayList<String>();

        colores.add("Rojo");
        colores.add("Blanco");
        colores.add("Amarillo");
        colores.add("Negro");
        colores.add("Azul");

        System.out.println("-Desordenado-");
        System.out.println("Colores: " + colores);

        Collections.sort(colores);
        System.out.println("-Ordenado-");
        System.out.println("Colores: " + colores);

        Collections.reverse(colores);
        System.out.println("-Reversa-");
        System.out.println("Colores: " + colores);

        Collections.shuffle(colores);
        System.out.println("-Aleatorio-");
        System.out.println("Colores: " + colores);
    }
}
