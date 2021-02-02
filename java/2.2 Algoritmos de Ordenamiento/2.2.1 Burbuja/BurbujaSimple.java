import java.util.Arrays;

public class BurbujaSimple {

	public static void main(String[] args) {
		int datos[] = new int[]{8,5,3,9,1};		
		System.out.println("Arreglo original: " + Arrays.toString(datos));

		for (int recorrido = 0; recorrido < datos.length; recorrido++) {
			for (int  indice = 0; indice < datos.length - 1; indice++) {				
				if (datos[indice] > datos[indice + 1]) { // Intercambio
					int buffer = datos[indice];	
					datos[indice] = datos[indice + 1];
					datos[indice + 1] = buffer;
				}								
			}
		}
		
		System.out.println("Arreglo ordenado: " + Arrays.toString(datos));		
	}
}

