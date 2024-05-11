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