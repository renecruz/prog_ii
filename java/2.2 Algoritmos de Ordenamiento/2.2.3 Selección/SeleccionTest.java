import java.util.Arrays;

public class SeleccionTest {
	public static void main(String[] args) {
		int datos[] = new int[]{8,5,3,9,1};		
		System.out.println("Arreglo original: " + Arrays.toString(datos));
	
		for (int indiceOrdenar = 0; indiceOrdenar < datos.length - 1; indiceOrdenar++) {
			int indiceMinimo = indiceOrdenar;
			for (int indiceComparar = indiceOrdenar + 1; indiceComparar < datos.length; indiceComparar++) {
				if ( datos[indiceComparar] < datos[indiceMinimo] ) {
					indiceMinimo = indiceComparar;
				}
			}
			int buffer = datos[indiceOrdenar];
			datos[indiceOrdenar] = datos[indiceMinimo];
			datos[indiceMinimo] = buffer;
		}
		
		System.out.println("Arreglo ordenado: " + Arrays.toString(datos));
	}
}

