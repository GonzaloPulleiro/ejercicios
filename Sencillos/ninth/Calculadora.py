'''
Crea un programa que pida al usuario dos números y el signo operacional.
El programa devolverá la operación solicitada por el usuario.

 @author: Gonzalo Pulleiro
 
'''

num1 = int(input("Introduce un número: \n"))
num2 = int(input("Introduce otro número: \n"))
signo = input("Introduce uno de los siguientes signos: + - / * : \n")

resultado = 0
operacion = ""

if(signo == "+"):
    resultado = num1 + num2
    operacion = "sumar"
elif(signo == "-"):
    resultado = num1 - num2
    operacion = "restar"
elif(signo == "*"):
    resultado = num1 * num2
    operacion = "multiplicar"
elif(signo == "/"):
    if(num2 != 0):
        resultado = num1 - num2
        operacion = "restar"
    else:
        print("No se puede dividir por cero")
else:
    print("El signo no se corresponde a los facilitados.")


print(f"El resultado de {operacion} {num1} y {num2} es = {resultado}")