'''
Crea un programa que pida al usuario una palabra
y devuelva esa palabra invertida
 
 @author: Gonzalo Pulleiro
 
'''

palabra = input("Introduce una palabra \n")
palabra = palabra.lower()

reverse = ""

for x in range (len(palabra) -1, -1, -1):
    reverse += palabra[x]

print(f"Tu palabra al revés es: {reverse}")