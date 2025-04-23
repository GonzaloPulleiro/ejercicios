'''
 Crea un programa que pida al usuario un número 
 y diga si el número es par o impar
 
 @author: Gonzalo Pulleiro
 
'''

num = int(input("Por favor, introduce un número...\n"))

if(num % 2 == 0):
    print("El número que has introducido es par")
else:
    print("El número que has introducido es impar.")