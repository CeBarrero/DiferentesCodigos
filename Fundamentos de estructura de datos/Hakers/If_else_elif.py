# -*- coding: utf-8 -*-
def main():

    edad = int(input("¿Cuántos años tiene? "))

#> < == != >=
    if edad>18:
        print("Mayor de Edad")
    else:
        print("Menor de Edad")

#if-else

    if edad >18:
        if edad<60:
            print("Puede hacer Servicio Militar")
        else:
            print("Demasiado viejo")
    else:
        print("Demasiado joven para hacer servicio Militar")


    pais=input("Ingresa tu pais")

    if pais=="mex":
        print("Eres mexicano")
    elif pais=="per":
        print("Eres peruano")
    elif pais=="arg":
        print("Eres Argentino")
    else:
        print("Eres de un pais desconocido")


main()