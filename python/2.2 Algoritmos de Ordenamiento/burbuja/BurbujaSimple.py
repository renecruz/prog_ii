import numpy as np

datos = np.array([8,5,3,9,1])
print ("Arreglo original: " + str(datos))

for recorrido in range(0, datos.size, 1): # range(inicio, fin, incremento)
	for indice in range(0, datos.size - 1, 1): 				
		if (datos[indice] > datos[indice + 1]): # Intercambio
			buffer = datos[indice]
			datos[indice] = datos[indice + 1]
			datos[indice + 1] = buffer

print ("Arreglo ordenado: " + str(datos))

