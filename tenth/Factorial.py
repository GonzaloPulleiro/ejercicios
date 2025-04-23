'''
Crea un programa que pida al usuario un número entero.
El programa devolverá el factorial de ese número.
(Ej.: 5! = 5*4*3*2*1 = 120).

 @author: Gonzalo Pulleiro
 
'''

num = int(input("Introduce un número entero... \n"))

factorial = 1

for x in range(1, num +1):
    factorial *= x

print("El factorial de {}! es = {}".format(num, factorial))