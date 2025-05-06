'''
Crea un programa que pida al usuario 3 números
y devuelva el mayor de los 3
 
 @author: Gonzalo Pulleiro
 
'''
print("Por favor, introduce 3 números")
num1 = int(input(""))
num2 = int(input(""))
num3 = int(input(""))

if(num1 > num2 and num1 > num3):
    print("{} es el número mayor.".format(num1))
elif (num1 < num2 and num2 > num3):
    print("{} es el número mayor.".format(num2))
else :
    print("{} es el número mayor.".format(num3))

