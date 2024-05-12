# 1. Write a  Python program to create an Enum object and display a member name and value.
# Sample data :
# Member name: Albania
# Member value: 355


from enum import Enum

""" class Season(Enum):
	Albania = 355
	SUMMER = 2
	AUTUMN = 3
	WINTER = 4
print('Member name: '+ Season.Albania.name)
print('Member value: ',end='')
print(Season.Albania.value)
 """
 
 
 
# 2. Write a  Python program that iterates over an enum class and displays each member and their value.
# Expected Output:
# Afghanistan = 93
# Albania = 355
# Algeria = 213
# Andorra = 376
# Angola = 244
# Antarctica = 672

class Countries(Enum):
    Afghanistan = 93
    Albania = 355
    Algeria = 213
    Andorra = 376
    Angola = 244
    Antarctica = 672

for country in Countries:
    print('{} = {}'.format(country.name,country.value))
    