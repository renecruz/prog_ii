import java.util.Arrays;

public class QuickSortTest {

	static int ordenarSeccion(int arr[], int indiceIzq, int indiceDer) {
		int pivote = arr[indiceDer]; //Decisión del programador
		int elemento = (indiceIzq - 1);
		for (int indice = indiceIzq; indice < indiceDer; indice++) {
			if (arr[indice] < pivote) { //Intercambio
				elemento++;				
				int buffer = arr[elemento];
				arr[elemento] = arr[indice];
				arr[indice] = buffer;
			}
		}
		elemento++;
		int buffer = arr[elemento];
		arr[elemento] = arr[indiceDer];
		arr[indiceDer] = buffer;

		return elemento;
	}

	static void ordenar(int arr[], int indiceIzq, int indiceDer) {
		if (indiceIzq < indiceDer) {
			int inicio = ordenarSeccion(arr, indiceIzq, indiceDer);
			ordenar(arr, indiceIzq, inicio - 1);
			ordenar(arr, inicio + 1, indiceDer);
		}
	}

	public static void main(String args[]) {
		int datos[] = { 8, 5, 3, 9, 1, 4, 7 };
		int longitud = datos.length;
		System.out.println("Arreglo original: " + Arrays.toString(datos));
		ordenar(datos, 0, longitud - 1);
		System.out.println("Arreglo ordenado: " + Arrays.toString(datos));
	}
	
	// Salida en consola: 
	// Arreglo original: [8, 5, 3, 9, 1, 4, 7]
	// Arreglo ordenado: [1, 3, 4, 5, 7, 8, 9]
}
