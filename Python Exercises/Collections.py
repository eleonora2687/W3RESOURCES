# 1. Write a Python program that iterates over elements as many times as its count.

from collections import Counter 
   
""" c = Counter(p=4, q=2)
print(list(c.elements())) 
 """  


# 2. Write a  Python program to find the most common elements and their counts in a specified text.
# Original string: lkseropewdssafsdfafkpwe
# Most common three characters of the said string:
# [('s', 4), ('e', 3), ('f', 3)]


""" c = Counter(list("lkseropewdssafsdfafkpwe"))
print(list(c.most_common(3))) """