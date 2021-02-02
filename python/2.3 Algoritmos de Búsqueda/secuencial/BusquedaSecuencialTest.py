#coding=utf-8

def busquedaSecuencial(datos, longitud,  datoBuscado):
	for indice in range(0,longitud):
		if (datos[indice] == datoBuscado): 
			return indice
	return -1

# Función principal 
if __name__ == "__main__":
	datos = [8, 5, 3, 9, 1, 4, 7]
	longitud = len(datos) 
	datoBuscado = 9
	indice = busquedaSecuencial(datos, longitud, datoBuscado)
	
	if (indice != -1):
		print(f"El dato {datoBuscado} está en el índice: {indice}")
	else:
		print(f"El dato {datoBuscado} no se encontró")

# Salida en consola: 
# El dato 9 está en el índice: 3