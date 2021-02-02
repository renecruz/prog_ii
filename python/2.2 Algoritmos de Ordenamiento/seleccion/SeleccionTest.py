import numpy as np

datos = np.array([8,5,3,9,1])
print ("Arreglo original: " + str(datos))

for indiceOrdenar in range(0, datos.size -1, 1):
	indiceMinimo = indiceOrdenar 
	for indiceComparar in range(indiceOrdenar + 1, datos.size, 1): 				
		if (datos[indiceComparar] < datos[indiceMinimo]): 
			indiceMinimo = indiceComparar
		
		buffer = datos[indiceOrdenar] # Intercambio
		datos[indiceOrdenar] = datos[indiceMinimo]
		datos[indiceMinimo] = buffer

print ("Arreglo ordenado: " + str(datos))

