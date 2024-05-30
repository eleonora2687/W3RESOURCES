# 1. Write a  Python script to sort (ascending and descending) a dictionary by value.

""" my_dict={"Eleonora": 1987, "marianna": 13,"asf":23456}
sorted_my_dict = sorted(my_dict.items(), key=lambda x:x[1])
sorted_desc=sorted(my_dict.items(), key=lambda item: item[1], reverse=True)
print(sorted_my_dict)
print(sorted_desc) """


# 2. Write a Python script to add a key to a dictionary.

""" thisdict = {0: 10, 1: 20}
thisdict[2] = 30
print(thisdict)
"""



# 3. Write a  Python script to concatenate the following dictionaries to create a new one.

# Sample Dictionary :
# dic1={1:10, 2:20}
# dic2={3:30, 4:40}
# dic3={5:50,6:60}
# Expected Result : {1: 10, 2: 20, 3: 30, 4: 40, 5: 50, 6: 60}


""" dic1={1:10, 2:20}
dic2={3:30, 4:40}
dic3={5:50,6:60}

dic4 = {**dic1, **dic2,**dic3}

print(dic4) """