# -*- coding: utf-8 -*-
import funciones

def main():

    funciones.suma(5,3)
    funciones.resta(5,3)
    funciones.multiplicacion(5,3)
    funciones.divicion(5,3)
    funciones.mod(5,3)

    num=[1,2,3,4,5]
    print()
    print("El resulato de la suma de num es -> ",end="")
    print(funciones.suma_varios(num))

main()


#funciones.py

def suma(a,b):
    print("La suma de ",a," y ",b,"es -> ",a+b)

def resta(a,b):
    print("La resta de ",a," y ",b,"es -> ",a-b)

def multiplicacion(a,b):
    print("La multiplicacion de ",a," y ",b,"es -> ",a*b)

def divicion(a,b):
    print("La divicion de ",a," y ",b,"es -> ",a/b)

def mod(a,b):
    print("La mod de ",a," y ",b,"es -> ",a%b)


def suma_varios(num):

    temp=0

    for i in range(len(num)):
        temp=temp+num[i]

    return temp