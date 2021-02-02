import java.util.Arrays;

public class InsercionTestV2 {
	public static void main(String[] args) {
		int datos[] = new int[]{8,5,3,9,1};		
		
		System.out.println("Arreglo original: " + Arrays.toString(datos));
	
		for (int recorrido = 1; recorrido < datos.length; recorrido++) {
			int buffer = datos[recorrido];
			int indice = recorrido;
			
			while ( (indice > 0) && (datos[indice - 1] > buffer)) {
				datos[indice] = datos[indice - 1] ;
				indice--;
			}
			datos[indice] = buffer;
		}
		
		System.out.println("Arreglo ordenado: " + Arrays.toString(datos));	
	}
}

