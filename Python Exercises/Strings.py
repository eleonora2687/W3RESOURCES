# 1. Write a  Python program to calculate the length of a string.

""" def str_len(s):
    j=0
    for ch in s:
       j+=1 
    return j

s="Hello world!"
print(str_len(s))

 """


# 2. Write a Python program to count the number of characters (character frequency) in a string.
# Sample String : 'google.com'
# Expected Result : {'g': 2, 'o': 3, 'l': 1, 'e': 1, '.': 1, 'c': 1, 'm': 1}


""" ch_freq = {}
s = 'Eleonora Trikidou'

for i in range(len(s)):
    count = 1
    al_count = False
    for j in range(i):
        if s[i] == s[j]:
            al_count = True
            break
    if al_count == False:
        for k in range(i+1,len(s)):
            if s[i] == s[k]:
                count +=1
        ch_freq[s[i]]=count
        
print(ch_freq)
 """






