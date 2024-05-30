# 1. Write a  Python function to reverse a list at a specific location.

""" def rev_lst(lst):
    reversed_lst=list(reversed(lst))
    return reversed_lst

names=["Eleonora","Marianna","Elina"]
print(rev_lst(names)) """




# 2. Write a  Python function find the length of the longest increasing sub-sequence in a list.


import random

""" rand_list=[]
n=10
for i in range(n):
	rand_list.append(random.randint(3,9))
print(rand_list)

max_len=1

for i in range(len(rand_list)-1):
    sub_seq_len = 1
    for j in range(i+1,len(rand_list)):
        if rand_list[j]>=rand_list[j-1]:
            sub_seq_len+=1
        else:
            break
    if sub_seq_len>max_len:
        max_len=sub_seq_len

print(max_len) """