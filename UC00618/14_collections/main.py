lst = [1,2,3,4,5,4,3,1,2,6,7,8,9,10, 1,3,1,3,1]

myset = {"Agua", "Sal", "Leite", "Polvilho", "Oleo", "Queijo"}

print(myset)

print(len(myset))

myset.add("Ovos")

print(myset)
print(len(myset))

myset.add("Açucar")
print(myset)
print(len(myset))

myset.add("Açucar")
print(myset)
print(len(myset))

myset.add("Açucar")
print(myset)
print(len(myset))

myset.remove("Açucar")
print(myset)
print(len(myset))

print(myset.pop()) # remove um ele random


set_lst = set(lst)
print(lst)
print(set_lst)
lst = list(set_lst)
print(lst)




myset = {"Agua", "Sal", "Leite", "Polvilho", "Oleo", "Queijo"}
myset.add("Ovos")
myset2 = {"Farinha", "Oleo", "Ovos", "Açúcar", "Iogurte"}



print(myset.union(myset2))
print(myset | myset2)

print(myset.intersection(myset2))
print(myset & myset2)

print(myset.difference(myset2))
print(myset - myset2)

print(myset2.difference(myset))
print(myset2 - myset)

print(myset.symmetric_difference(myset2))
print(myset ^ myset2)


print("--------")
print(myset)
#myset.intersection_update(myset2)

i = 10
i = i + 14
i += 14
myset &= myset2

print(myset)



set1 = {1,2,3,4,5,6,7,8,9,10}
set2 = {2,4,5,6,8,10}
set3 = {10,12,13,14,15,16,17,18,19,20}


print(set1.issuperset(set2))

print(set1.issubset(set2))

print(set2.issubset(set1))


print(set1.isdisjoint(set2))

print(set1.isdisjoint(set3))