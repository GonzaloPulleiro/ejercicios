'''
Crea un programa que pida al usuario un número
e indique al usuario si es primo o no.
 
 @author: Gonzalo Pulleiro
 
'''

import math

num = int(input("Introduce un número...\n"))

esPrimo = True

if(num <= 1):
    esPrimo = False
else:
    for x in range(2, int(math.sqrt(num)) + 1):
        if(num % x == 0):
            esPrimo = False
            break


if(not esPrimo):
    print("{} no es un número primo.".format(num))
else:
    print("{} es un número primo.".format(num))
