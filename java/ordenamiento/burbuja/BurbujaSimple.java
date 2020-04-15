import java.util.Arrays;

public class BurbujaSimple {

	public static void main(String[] args) {
		int valores[] = new int[]{2,41,563,101,13};		
		System.out.println("Valores: " + Arrays.toString(valores));
		int operaciones = 0;				
		
		for (int corrida = 0; corrida < valores.length; corrida++) {
			operaciones++;
			for (int  indice = 0; indice < valores.length - 1; indice++) {
				operaciones++;
				if (valores[indice] > valores[indice + 1]) { // Intercambio
					int valorTemporal = valores[indice];	
					valores[indice] = valores[indice + 1];
					valores[indice + 1] = valorTemporal;
				}								
			}
		}
		
		System.out.println("Valores: " + Arrays.toString(valores));
		System.out.println("Operaciones realizadas: " + operaciones);
	}
}