import java.util.Arrays;

public class BurbujaOptimizada {

	public static void main(String[] args) {
		int datos[] = new int[]{8,5,3,9,1};		
		System.out.println("Arreglo original: " + Arrays.toString(datos));		
		
		for (int recorrido = 0; recorrido < datos.length; recorrido++) {			
			for (int  indice = 0; indice < recorrido; indice++) {
				if (datos[recorrido] < datos[indice]) { // Intercambio
					int buffer = datos[indice];	
					datos[indice] = datos[recorrido];
					datos[recorrido] = buffer;
				}								
			}
		}
		
		System.out.println("Arreglo ordenado: " + Arrays.toString(datos));		
	}
}

