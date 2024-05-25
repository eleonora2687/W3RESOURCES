import json

# 1. Write a  Python program to convert JSON data to Python object.

""" import json

x='{"name":" Trikidou Eleonora", "height": 1.61, "city":"Thessaloniki"}'

y=json.loads(x)
print(y) """



# 2. Write a Python program to convert Python object to JSON data.


""" x={
    'First Name': 'Eleonora',
    'Last Name': 'Trikidou',
    'age': 37,
    'city':'Thessaloniki'
}

y=json.dumps(x)

print(y)
print(x) """



# 3. Write a  Python program to convert Python objects into JSON strings. Print all the values.

""" lst = ['orange', 0, 'orange', 3.14, None, False]

json_lst = json.dumps(lst)

print(json_lst)



dicti = {'name': ' eleonora', 'surname': 'trikidou', 'grade': 7.19}

json_dicti = json.dumps(dicti)

print(json_dicti)



tpl = ('orange', 0, True, None, 3.14, 'orange')
json_tpl = json.dumps(tpl)

print(json_tpl) """


# 4. Write a Python program to convert Python dictionary object (sort by key) to JSON data. 
# Print the object members with indent level 4.


myDict = {'ravi': 10, 'rajnish': 9,
        'sanjeev': 15, 'yash': 2, 'suraj': 32}
 
myKeys = list(myDict.keys())
myKeys.sort()

print(myKeys)

sorted_dict = {i: myDict[i] for i in myKeys}
 
print(sorted_dict)

j_son_dict=json.dumps(sorted_dict, indent=2)

