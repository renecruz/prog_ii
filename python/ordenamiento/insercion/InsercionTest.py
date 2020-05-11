import numpy as np

datos = np.array([8,5,3,9,1])
print ("Arreglo original: " + str(datos))

for recorrido in range(1, datos.size, 1):
	buffer = datos[recorrido] 
	for indice in range(recorrido, 0, -1): 				
		if (datos[indice] < datos[indice - 1]): # Intercambio
			buffer = datos[indice]
			datos[indice] = datos[indice - 1]
			datos[indice - 1] = buffer

print ("Arreglo ordenado: " + str(datos))