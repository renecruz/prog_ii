def busquedaSecuencial(datos, indiceIzq, indiceDer,  datoBuscado):
	for indice in range(indiceIzq, indiceDer):
		if (datos[indice] == datoBuscado): 
			return indice
	return -1

def busquedaBinaria(datos, longitud,  datoBuscado):
	mitad = int(longitud/2) # Mitad del arreglo
	if (datos[mitad] == datoBuscado):
		return mitad
	elif (datoBuscado < datos[mitad]): # Buscar en la mitad izquierda
		return busquedaSecuencial(datos, 0, mitad, datoBuscado)
	else: # Buscar en la mitad derecha
		return busquedaSecuencial(datos, mitad + 1, longitud, datoBuscado)

# Función principal 
if __name__ == "__main__":
	datos = [1, 3, 4, 5, 7, 8, 9]
	longitud = len(datos) 
	datoBuscado = 8
	indice = busquedaBinaria(datos, longitud, datoBuscado)
	
	if (indice != -1):
		print(f"El dato {datoBuscado} está en el índice: {indice}")
	else:
		print(f"El dato {datoBuscado} no se encontró")

# Salida en consola: 
# El dato 8 está en el índice: 5