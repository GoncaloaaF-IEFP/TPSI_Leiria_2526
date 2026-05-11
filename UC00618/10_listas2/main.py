"""

CRUD

criar da lista

aceder a elm

atulizar elm

adicionar elm

remover elm

iterar lista

"""


#         0       1      2        3       4      5
lst = ["Ne" ,"elm1" ,"elm2"  ,"elm3" , "elm4", "elm5" ,"elm6"]

print(lst[2])

lst[2] = "nome"

print(lst[2])

lst.append("nome2")

print(lst)

## lst tem 5 elm
"""
lst = [1,2,3,4,5]
count = 0

for i in lst:
    for j in lst:
        count += 1
        print(f"{count}: {i} {j}")
        
"""

lst.insert(2,"elm7")
lst.insert(2,"elm7")
lst.insert(2,"elm7")
print(lst)


print(lst.count("elm7"))
print(lst.__len__())
print(len(lst))

# ['Ne', 'elm1', 'elm7', 'elm7', 'elm7', 'nome', 'elm3', 'elm4', 'elm5', 'elm6', 'nome2']
print(lst)
lst.remove("nome")
print(lst)

lst.pop(2)

print(lst)

print(lst.index("elm7"))



