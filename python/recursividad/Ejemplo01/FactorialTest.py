def factorial(n):
	if (n == 0): # Caso base 
		return 1
	else: # Caso recursivo
		return n*factorial(n-1)

num = 5
print("Factorial de " + str(num) + " es: " + str(factorial(num)))