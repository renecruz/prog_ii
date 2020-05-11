def esPar(n):
	if (n == 0):
		return 1
	else:
		return esImpar(n-1)
	
def esImpar(n):
	if (n == 0):
		return 0
	else:
		return esPar(n-1)

numero = 6
resultado = esPar(numero)
print( str(numero) + " es: " + ("par" if (resultado == 1) else "impar") )