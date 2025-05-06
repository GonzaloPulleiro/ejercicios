'''
Genera un número aleatorio entre 1 y 100
el usuario debe adivinar el número
por cada intento el programa debe informar si el número
es demasiado bajo, demasiado alto o es correcto

El juego termina cuando el usuario acierta y muestra el total de intentos

@author: Gonzalo Pulleiro
'''
import random

adivina = random.randint(1, 100)
print("Número aleatorio: {}".format(adivina))

intentos = 1

numero = int(input("Por favor, ingresa un número entre 1 y 100...\n"))

while numero < 1 or numero > 100:
    print("El número introducido no es válido")
    numero = int(input("Por favor, ingresa un número entre 1 y 100...\n"))


while numero != adivina:
    if numero < adivina:
        print("El número introducido es menor al número buscado")
    else:
        print("El número introducido es mayor al número buscado")
    
    numero = int(input("Por favor, ingresa un número...\n"))

    while numero < 1 or numero > 100:
        print("El número introducido no es válido")
        numero = int(input("Por favor, ingresa un número entre 1 y 100...\n"))

    intentos = intentos + 1

print("Enhorabuena, has acertado el número aleatorio")
print(f"Total de intentos: ", intentos)