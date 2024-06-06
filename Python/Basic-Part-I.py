# 1. Write a  Python program to print the following string in a specific format (see the output).
# Sample String : "Twinkle, twinkle, little star, How I wonder what you are! Up above the world so high, Like a diamond in the sky. Twinkle, twinkle, little star, How I wonder what you are"
# Output :

# Twinkle, twinkle, little star,
# 	How I wonder what you are! 
# 		Up above the world so high,   		
# 		Like a diamond in the sky. 
# Twinkle, twinkle, little star, 
# 	How I wonder what you are


""" print('Twinkle, twinkle, little star,\n\tHow I wonder what you are!\n\t\tUp above the world so high,\n\t\tLike a diamond in the sky.\n'+
      'Twinkle, twinkle, little star,\n\tHow I wonder what you are!') """
      
      
# 2. Write a  Python program to find out what version of Python you are using.
     
""" 
import sys
print(sys.version) 

"""



# 3. Write a Python program to display the current date and time.
# Sample Output :
# Current date and time :
# 2014-07-05 14:34:14


""" from datetime import datetime


now = datetime.now()
 
dt_string = now.strftime("%Y-%m-%d %H:%M:%S")
print("Current date and time: ")
print(dt_string) """



# 4. Write a Python program that calculates the area of a circle based on the radius entered by the user.
# Sample Output :
# r = 1.1
# Area = 3.8013271108436504


import math

""" def area(r):
      return math.pi*r*r

radius = float(input("Enter radius of the circle: "))
print('Area = ',area(radius)) """



# 5. Write a  Python program that accepts the user's first and last name and prints them in reverse order with a space between them.

""" first = str(input('Enter your first name: '))
last = input('Enter your last name: ')

print(last + ' ' + first) """




# 6. Write a Python program that accepts a sequence of comma-separated numbers from the user and generates a list and a tuple of those numbers.
# Sample data : 3, 5, 7, 23
# Output :
# List : ['3', ' 5', ' 7', ' 23']
# Tuple : ('3', ' 5', ' 7', ' 23')



""" values = input("Input some comma-separated numbers: ")

lst = values.split(",")

tuple = tuple(lst)

print('List : ', lst)
print('Tuple : ', tuple)
 """
 
 
# 7. Write a  Python program that accepts a filename from the user and prints the extension of the file.
# Sample filename : abc.java
# Output : java


""" filename = input('Enter the name of a file: ')

i = len(filename) - 1
counter = 0

while filename[i] != '.':
      counter += 1
      i -= 1
for j in range(counter, 0, -1):
      print(filename[len(filename) -1 - j + 1], end='') """



    
#  8. Write a  Python program to display the first and last colors from the following list.
#  color_list = ["Red","Green","White" ,"Black"]


""" color_list = ["Red","Green","White" ,"Black"]

print(color_list[0], color_list[-1], sep=' - ', end='') """


