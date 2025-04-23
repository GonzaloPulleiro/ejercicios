'''
Crea un programa que pida al usuario una frase.
El programa contará el total de vocales en la frase
y lo devolverá al usuario. También devolverá la 
cantidad de veces que aparece cada vocal en la frase.
 
 @author: Gonzalo Pulleiro
 
'''

frase = input("Introduce una frase... \n")

a = e = i = o = u = contador = 0

for c in frase:
    c = c.lower()

    if c == 'a':
        a += 1
        contador += 1
    elif c == 'e':
        e += 1
        contador += 1
    elif c == 'i':
        i += 1
        contador += 1
    elif c == 'o':
        o += 1
        contador += 1
    elif c == 'u':
        u += 1
        contador += 1

print("El total de vocales en la frase es de: {}".format(contador))
print("Distribuídas en las siguientes cantidades: ")
print(f"A = {a}\tE = {e}\tI = {i}\tO = {o}\tU = {u}")