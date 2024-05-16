# 1. Write a  Python program to find those numbers which are divisible by 7 and multiples of 5, between 1500 and 2700 (both included).

""" for i in range(1500,2701,5):
    if i%7 ==0:
        print(i) """
        
        
# 4. Write a  Python program to construct the following pattern, using a nested for loop.

# * 
# * * 
# * * * 
# * * * * 
# * * * * * 
# * * * * 
# * * * 
# * * 
# *


""" n = int(input("Give a positive integer greater than 1 and lesser or equal to 10: "))

if n >= 2 and n <= 10:
    for i in range(1,n+1):
        for j in range(i):
            print("*", end="")
        print()
    for j in range(n-1,0,-1):
        for k in range(j):
            print("*", end="")
        print()
        
 """