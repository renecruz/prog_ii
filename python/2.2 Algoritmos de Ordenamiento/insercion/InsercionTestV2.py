import numpy as np

datos = np.array([8,5,3,9,1])
print ("Arreglo original: " + str(datos))

for recorrido in range(1, datos.size, 1):
	buffer = datos[recorrido]
	indice = recorrido 
	
	while ( (indice > 0) and (datos[indice - 1] > buffer)): 
		datos[indice] = datos[indice - 1] 
		indice -= 1
	
	datos[indice] = buffer

print ("Arreglo ordenado: " + str(datos))

