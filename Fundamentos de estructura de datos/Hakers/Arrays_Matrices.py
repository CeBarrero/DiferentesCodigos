# -*- coding: utf-8 -*-
def main():

#arrays

    v=[1,2,3,4,5,6,7,8,9,0]

    for i in v :
        print(i," ",end="")

    print()

#Las listas son dinámicas por lo que podemos
#introducir nuevos elementos en ellas con append.

    v.append(99)

    for i in range(len(v)) :
        print(v[i]," ",end="")

    print()

#Con insert podemos añadir elementos al array
#en la pocision deseada

    v.insert(3,55)

    for i in range(len(v)) :
        print(v[i]," ",end="")

    print()


#Con del podemos eliminar un elemento por su indice

    del v[0]
    del v[0]
    del v[0]

    for i in range(len(v)) :
        print(v[i]," ",end="")

    print("\n")

#matricez

    m=[[1,2,3],[4,5,6],[7,8,9]]

    m[0][0]=3
    m[0][1]=2
    m[0][2]=1

    for i in range(len(m)):
        for j in range(len(m[i])):
            print(m[i][j]," ",end="")
        print()

main()