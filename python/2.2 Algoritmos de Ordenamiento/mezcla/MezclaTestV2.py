def mergeSort(seq, start, end):
	
	if end-start > 1:
		middle = (start+end) // 2 #División de piso (entera)
		mergeSort(seq, start, middle)
		mergeSort(seq, middle, end)
		merge(seq, start, middle, end)
		
def merge(seq, left, middle, rightEnd):
	while left<middle and middle<rightEnd:
		if (seq[left] > seq[middle]):
			seq.insert(left, seq.pop(middle))
			middle += 1
		else:
			left += 1

# Esto es un array, que no tiene operaciones como insert, pop, etc. requiere hacer: import array as arr 
# data = arr.array("i",[21, 63, 47, 3, 68, 20, 43])

# Esto es una lista, equivalente a un arreglo en PHP o Javascript
# data = [21, 63, 47, 3, 68, 20, 43]

# para usar sample, de sebe poner:  import random as rn
# range(100) -> el rango de valores que pueden tener los datos generados
# 7 -> la cantidad de datos que queremos que 
# data = rn.sample(range(100), 7) 

if __name__ == "__main__":
	datos = [8,5,3,9,1]
	print ("Arreglo original: " + str(datos))
	mergeSort(datos, 0, len(datos))
	print ("Arreglo ordenado: " + str(datos))