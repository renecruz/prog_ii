class BusquedaSecuencialTest {

	static int busquedaSecuencial(int datos[], int longitud,  int datoBuscado) {	
		for (int indice = 0; indice < longitud; indice ++)	{
			if (datos[indice] == datoBuscado) {
				return indice;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int datos[] = { 8, 5, 3, 9, 1, 4, 7 };
		int longitud = datos.length;
		int datoBuscado = 9;
		
		int indice = busquedaSecuencial(datos, longitud, datoBuscado);
		System.out.print("El dato " + datoBuscado);
		if (indice != -1) {
			System.out.println(" está en el índice: " + indice);
		} else {
			System.out.println(" no se encontró");
		}
	}
	
	// Salida en consola: 
	// El dato 9 está en el índice: 3
}
