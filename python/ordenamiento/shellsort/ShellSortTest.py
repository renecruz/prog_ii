def ordenarShell(arreglo): 

	arreglo_size = len(arreglo) 
	brecha = int(arreglo_size/2) #división entera
	
	while brecha > 0: 		
		for recorrido in range(brecha,arreglo_size): 			
			buffer = arreglo[recorrido] 
			indice = recorrido 
			while indice >= brecha and arreglo[indice-brecha] > buffer: 
				arreglo[indice] = arreglo[indice-brecha] 
				indice -= brecha 
			arreglo[indice] = buffer 
			
		brecha = int(brecha/2) #división entera

# Función principal 
if __name__ == "__main__":
	datos = [8, 5, 3, 9, 1, 4, 7]
	arreglo_size = len(datos) 
	print ("Arreglo original: " + str(datos)) 
	ordenarShell(datos) 
	print ("Arreglo original: " + str(datos)) 



