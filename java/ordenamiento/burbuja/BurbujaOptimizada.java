import java.util.Arrays;

public class BurbujaOptimizada {

	public static void main(String[] args) {
		int valores[] = new int[]{2,41,563,101,13};		
		System.out.println("Valores: " + Arrays.toString(valores));
		int operaciones = 0;	
		
		for (int indice1 = 0; indice1 < valores.length; indice1++) {
			operaciones++;
			for (int  indice2 = 0; indice2 < indice1; indice2++) {
				operaciones++;
				if (valores[indice1] < valores[indice2]) { // Intercambio
					int valorTemporal = valores[indice2];	
					valores[indice2] = valores[indice1];
					valores[indice1] = valorTemporal;
				}								
			}
		}
		
		System.out.println("Valores: " + Arrays.toString(valores));
		System.out.println("Operaciones realizadas: " + operaciones);
	}
}