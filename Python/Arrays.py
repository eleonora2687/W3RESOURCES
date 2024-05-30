# 1. Write a  Python program to create an array of 5 integers and display the array items. Access individual elements through indexes.
# Sample Output:
# 1
# 3
# 5
# 7
# 9
# Access first three items individually
# 1
# 3
# 5


import array as arr
""" a = arr.array('i', [1,3,5,7,9])
for i in range(0, 3):
    print(a[i], end="\n")
 """
 
 
# 2. Write a Python program to append a new item to the end of the array.
# Sample Output:
# Original array: array('i', [1, 3, 5, 7, 9])
# Append 11 at the end of the array:
# New array: array('i', [1, 3, 5, 7, 9, 11])


""" a = arr.array('i', [1,3,5,7,9])
print('Original array: ',end='')
print(a)
a.append(11)
print('New array: ',end='')
print(a)
 """