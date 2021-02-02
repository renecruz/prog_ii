def ordenarSeccion(arr, indiceIzq, indiceDer): 
	pivote = arr[indiceDer]	
	elemento = ( indiceIzq - 1 )		 
	 
	for indice in range(indiceIzq , indiceDer): 
		if arr[indice] < pivote: 
			elemento = elemento + 1
			buffer = arr[elemento]
			arr[elemento] = arr[indice]
			arr[indice] = buffer

	buffer = arr[elemento + 1]
	arr[elemento + 1] = arr[indiceDer]
	arr[indiceDer] = buffer
	 
	return ( elemento + 1 ) 

def ordenar(arr, indiceIzq, indiceDer): 
	if indiceIzq < indiceDer: 
		inicio = ordenarSeccion(arr,indiceIzq,indiceDer) 
		ordenar(arr, indiceIzq, inicio - 1) 
		ordenar(arr, inicio + 1, indiceDer) 

# Función principal 
if __name__ == "__main__":
	datos = [8, 5, 3, 9, 1, 4, 7] 
	n = len(datos) 
	print ("Arreglo original: " + str(datos))
	ordenar(datos, 0, n - 1) 
	print ("Arreglo ordenado: " + str(datos))

# Salida en consola: 
# Arreglo original: [8, 5, 3, 9, 1, 4, 7]
# Arreglo ordenado: [1, 3, 4, 5, 7, 8, 9]