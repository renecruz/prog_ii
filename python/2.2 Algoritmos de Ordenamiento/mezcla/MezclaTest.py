def ordenar(arr): 
	if len(arr) >1: 
		mitad = int(len(arr)/2) 
		
		izquierda = arr[:mitad] # Copia los elementos de la mitad izquierda del arreglo  
		derecha = arr[mitad:] # Copia los elementos de la mitad derecha del arreglo
		
		ordenar(izquierda) # Ordena la primera mitad
		ordenar(derecha) # Ordena la segunda mitad
		mezclar(arr,izquierda,derecha)  # Mezcla las dos mitades

def mezclar(arr, izquierda, derecha):
		indiceIzq = indiceDer = indiceArr = 0
		  
		# Copia y ordena los elementos de los arreglos izquierda[] and derecha[] 
		while indiceIzq < len(izquierda) and indiceDer < len(derecha): 
			if izquierda[indiceIzq] < derecha[indiceDer]: 
				arr[indiceArr] = izquierda[indiceIzq] 
				indiceIzq+=1
			else: 
				arr[indiceArr] = derecha[indiceDer] 
				indiceDer+=1
			indiceArr+=1
		  
		# // verifica si aun hay elementos en alguna de las mitades
		while indiceIzq < len(izquierda): 
			arr[indiceArr] = izquierda[indiceIzq] 
			indiceIzq+=1
			indiceArr+=1
		  
		while indiceDer < len(derecha): 
			arr[indiceArr] = derecha[indiceDer] 
			indiceDer+=1
			indiceArr+=1
  
# funcion main
if __name__ == "__main__":
	datos = [8, 5, 3, 9, 1, 4, 7]  
	print ("Arreglo original: " + str(datos))
	ordenar(datos)
	print ("Arreglo ordenado: " + str(datos))

