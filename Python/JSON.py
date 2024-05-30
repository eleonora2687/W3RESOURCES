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


""" myDict = {'ravi': 10, 'rajnish': 9,
        'sanjeev': 15, 'yash': 2, 'suraj': 32}
 
myKeys = list(myDict.keys())
myKeys.sort()

print(myKeys)

sorted_dict = {i: myDict[i] for i in myKeys}
 
print(sorted_dict)

j_son_dict=json.dumps(sorted_dict, indent=2)

 """


# 5. Write a Python program to convert JSON encoded data into Python objects.

""" json_lst = '[0, 1, 0, 1, 2, -4]'
json_dict = '{"name": "Eleonora", "surname": "Trikidou", "age": 37}'
json_int = '2'
json_float = '3.14'
json_str = '"Hello world"'

python_lst = json.loads(json_lst)
python_dict = json.loads(json_dict)
python_int = json.loads(json_int)
python_float = json.loads(json_float)
python_str = json.loads(json_str)

print(python_lst)
print(python_dict)
print(json_int)
print(json_float)
print(json_str)



 """