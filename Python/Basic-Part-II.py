# 1. Write a  Python function that takes a sequence of numbers and determines whether all the numbers are different from each other.

""" def test_distinct(data):
    if len(data) == len(set(data)):
        return True
    else:
        return False

print(test_distinct([1, 5, 7, 5]))
print(test_distinct([2, 4, 5, 5, 7, 9]))    
"""


# 2. Write a Python program that creates all possible strings using the letters 'a', 'e', 'i', 'o', and 'I'. 
# Ensure that each character is used only once.

from ntpath import join
import random

""" char_list = ['a', 'e', 'i', 'o', 'u']

random.shuffle(char_list)

print(''.join(char_list)) """


# 3. Write a Python program that removes and prints every third number from a list of numbers until the list is empty.

""" nums = [1, 2, 3, 4, 5, 6, 7, 8, 9]
position = 2
index = 0
len_list = len(nums)
    
while len_list > 0:
    index = (position + index) % len_list
    print(nums.pop(index))
    len_list -= 1


 """