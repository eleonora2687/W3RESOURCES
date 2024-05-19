# 1. Write a  Python program to find those numbers which are divisible by 7 and multiples of 5, between 1500 and 2700 (both included).

""" for i in range(1500,2701,5):
    if i%7 ==0:
        print(i) """
        


# 3. Write a Python program to guess a number between 1 and 9.
# Note : User is prompted to enter a guess. If the user guesses wrong then the prompt appears again until the guess is correct, 
# on successful guess, user will get a "Well guessed!" message, and the program will exit.

import random


""" list1 = [1, 2, 3, 4, 5, 6, 7, 8, 9]

while True:
    guess = int(input('Enter your guess: '))
    if guess == random.choice(list1):
        print('Well guessed!')
        exit
    else:
        print('Wrong guess..')
        continue
"""


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