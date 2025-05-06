'''
 Solicita al usuario una palabra o frase
 Determina si la entrada es un palíndromo (igual al revés)
 
 @author: Gonzalo Pulleiro
'''
import re
import unicodedata

entrada = input("Por favor, introduce una palabra o una frase...\n")

entrada = unicodedata.normalize('NFD', entrada)
entrada = ''.join(c for c in entrada if unicodedata.category(c) != 'Mn')

entrada = re.sub(r'[^a-z0-9]', '', entrada.lower())

salida = entrada[::-1]

print("Inroducido: {}. Obtenido: {}".format(entrada, salida))

if entrada == salida:
    print("Palíndromo.")
else:
    print("NO Palíndromo")