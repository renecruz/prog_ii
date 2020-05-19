import java.util.Arrays;

public class MezclaTest {

	static void mezclar(int arr[], int izquierda[], int derecha[]) {
		int indiceIzq=0, indiceDer=0, indiceArr = 0;
		
		// Copia y ordena los elementos de los arreglos izquierda[] and derecha[] 
		while (indiceIzq < izquierda.length && indiceDer < derecha.length) { 
			if (izquierda[indiceIzq] < derecha[indiceDer]) { 
				arr[indiceArr] = izquierda[indiceIzq]; 
				indiceIzq+=1;
			}
			else { 
				arr[indiceArr] = derecha[indiceDer];
				indiceDer+=1;
			}
			indiceArr+=1;
		}
		
		// verifica si aun hay elementos en alguna de las mitades
		while (indiceIzq < izquierda.length) {
			arr[indiceArr] = izquierda[indiceIzq];
			indiceIzq+=1;
			indiceArr+=1;
		}
		  
		while (indiceDer < derecha.length) { 
			arr[indiceArr] = derecha[indiceDer]; 
			indiceDer+=1;
			indiceArr+=1;
		}
	}
	
	static void ordenar(int arr[]) {
		if (arr.length >1) {
			int mitad = arr.length/2;
			int n1 = mitad;
			int n2 = arr.length - mitad;

			// Crea arreglos temporales para las dos mitades
			int izquierda[] = new int[n1];
			int derecha[] = new int[n2];

			// Copia los elementos que corresponden en cada mitad
			for (int indiceIzq = 0; indiceIzq < n1; ++indiceIzq)
				izquierda[indiceIzq] = arr[indiceIzq];
			for (int indiceDer = 0; indiceDer < n2; ++indiceDer)
				derecha[indiceDer] = arr[mitad + indiceDer];
			
			ordenar(izquierda); // Ordena la primera mitad 
			ordenar(derecha); // Ordena la segunda mitad
			mezclar(arr, izquierda, derecha); // Mezcla las dos mitades
		}
	}
		
	public static void main(String[] args) {
		int datos[] = new int[] { 8, 5, 3, 9, 1, 4, 7};
		System.out.println("Arreglo original: " + Arrays.toString(datos));
		ordenar(datos);
		System.out.println("Arreglo ordenado: " + Arrays.toString(datos));	
	}
}

	