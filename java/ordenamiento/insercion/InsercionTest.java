import java.util.Arrays;

public class InsercionTest {
	public static void main(String[] args) {
		int datos[] = new int[]{8,5,3,9,1};		
		System.out.println("Arreglo original: " + Arrays.toString(datos));
		
		for (int recorrido = 1; recorrido < datos.length; recorrido++) {
			int buffer = datos[recorrido];
			for (int indice = recorrido; indice > 0; indice--) {
				if ( datos[indice] < datos[indice - 1] ) { //Intercambio
					buffer = datos[indice];
					datos[indice] = datos[indice - 1];
					datos[indice - 1] = buffer;
				}		
			}
		}
		
		System.out.println("Arreglo ordenado: " + Arrays.toString(datos));	
	}
}