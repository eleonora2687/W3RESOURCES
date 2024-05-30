# 1. Write a  Python program to calculate the sum of a list of numbers using recursion.

""" def rec_sum(lst,suma,i):
    if i == len(lst):
        return suma
    suma=suma+lst[i]
    return rec_sum(lst,suma,i+1)

lst=[1,2,3,4,5]
print(rec_sum(lst,0,0)) """




def toStr(n,base):
   convertString = "0123456789ABCDEF"
   if n < base:
      return convertString[n]
   else:
      return toStr(n//base,base) + convertString[n%base]

print(toStr(8,2))
