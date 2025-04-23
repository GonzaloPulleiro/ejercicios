'''
Crea un programa que pida al usuario un número
y devuelva la tabla de multiplicar hasta 10 ese número
 
 @author: Gonzalo Pulleiro
 
'''
num = int(input("Introduce un número\n"))

print("*** Tabla de multiplicar del {} ***".format(num))

for x in range(1, 11):
    print("{} * {} = {}".format(num, x, num * x))
print("***************")
