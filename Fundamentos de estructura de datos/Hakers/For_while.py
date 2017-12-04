# -*- coding: utf-8 -*-
def main():

    i=0
    while i<=100:
        print(i," ",end="")
        if i%10==0:
            print();

        i=i+1

    print();
    for i in range(26):
        print(i," ", end="")
        if i==15:
            break



main()