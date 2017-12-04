# -*- coding: utf-8 -*-
numbers = input()
numbers_array = numbers.split(",")
distance = int (input())
counter = 0

for i in range( len(numbers_array)):
    for j in range ( i + 1, len(numbers_array)):
        if(distance == abs(int(numbers_array[i]))):
            counter += 1

print (counter)

