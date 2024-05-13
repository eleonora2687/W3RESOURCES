# 1. Write a Python program to find a list of integers with exactly two occurrences of nineteen and at least three occurrences of five. Return True otherwise False.
# Input:
# [19, 19, 15, 5, 3, 5, 5, 2]
# Output:
# True
# Input:
# [19, 15, 15, 5, 3, 3, 5, 2]
# Output:
# False
# Input:
# [19, 19, 5, 5, 5, 5, 5]
# Output:
# True


""" def two_three(lst):
    cnt1=0
    cnt2=0
    yes=False
    for i in range(len(lst)):
        if lst[i] == 19 or lst[i] == 5:
            if lst[i] == 19:
                cnt1+=1
            else:
                cnt2+=1
        if cnt1 == 2 and cnt2 == 3:
            yes = True
            break
    if yes == True:
        return True
    return False

print(two_three([19, 19, 15, 5, 3, 5, 5, 2]))
print(two_three([19, 15, 15, 5, 3, 3, 5, 2]))
print(two_three([19, 19, 5, 5, 5, 5, 5])) """



# 2. Write a Python program that accepts a list of integers and calculates the length and the fifth element. Return true if the length of the list is 8 and the fifth element occurs thrice in the said list.
# Input:
# [19, 19, 15, 5, 5, 5, 1, 2]
# Output:
# True
# Input:
# [19, 15, 5, 7, 5, 5, 2]
# Output:
# False
# Input:
# [11, 12, 14, 13, 14, 13, 15, 14]
# Output:
# True
# Input:
# [19, 15, 11, 7, 5, 6, 2]
# Output:
# False



def fifth_ele(lst):
    if len(lst)==8:
        counter=1
        for i in range(len(lst)):
            if i!=4 and lst[i]==lst[4]:
                counter+=1
        if counter==3:
            return True
    return False

print(fifth_ele([19, 19, 15, 5, 5, 5, 1, 2]))
print(fifth_ele([19, 15, 5, 7, 5, 5, 2]))
print(fifth_ele([11, 12, 14, 13, 14, 13, 15, 14]))
print(fifth_ele([19, 15, 11, 7, 5, 6, 2]))