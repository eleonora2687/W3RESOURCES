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

