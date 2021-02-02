class BusquedaBinariaTest {
	
	static int busquedaSecuencial(int datos[], int indiceIzq, int indiceDer,  int datoBuscado) {	
		for (int indice = indiceIzq; indice < indiceDer; indice ++)	{
			if (datos[indice] == datoBuscado) {
				return indice;
			}
		}
		return -1;
	}
	
	static int busquedaBinaria(int datos[],int longitud, int datoBuscado) {
		int mitad = longitud/2; // Mitad del arreglo
		if (datos[mitad] == datoBuscado) {
			return mitad;
		} else if (datoBuscado < datos[mitad]) { // Buscar en la mitad izquierda
			return busquedaSecuencial(datos, 0, mitad, datoBuscado);
		} else { // Buscar en la mitad derecha
			return busquedaSecuencial(datos, mitad + 1, longitud, datoBuscado);
		}
	}
	
	public static void main(String[] args) {
		int datos[] = { 1, 3, 4, 5, 7, 8, 9 }; // Arreglo ordenado
		int longitud = datos.length; 
		int datoBuscado = 5;
		
		int indice = busquedaBinaria(datos, longitud, datoBuscado);
		
		System.out.print("El dato " + datoBuscado);
		if (indice != -1) {
			System.out.println(" está en el índice: " + indice);
		} else {
			System.out.println(" no se encontró");
		}
	}
	
	// Salida en consola: 
	// El dato 8 está en el índice: 5
}