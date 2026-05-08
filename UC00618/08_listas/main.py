lst = ["val1", "val2", "val3"]

print(lst)
print(lst[1])
# print(lst[6])

print( lst.__len__() )
print( len(lst) )
print("--" * 10)

print(lst[1])
lst[1] = "Teste"
print(lst[1])

# crie uma lista com 5 valors predefinidos,

lst2 = ["Joana", "Maria", "Rita", "Ana", "Inês"]

# altere o valor do idx 3
print(lst2)
lst2[3] = "Diana"
print(lst2)

lst2.append("Joana")
print(lst2)

print(lst2.count("Joana"))
print(lst2.count("Rui"))
print(lst2.index("Maria"))


print("--" * 10)
print(lst2)

lst2.pop()
print(lst2)

lst2.pop(2)
print(lst2)

print("--" * 10)

print(lst2)
lst2.insert(2, "Ana")

print(lst2)

lst2.sort()

print(lst2)
print("--" * 10)
print(lst2)
print(lst2.remove("Inês"))
print(lst2)

print(lst2.pop(1))
print(lst2)

print("--" * 10)


for elm in lst2:
    print(elm)

print("--" * 10)


"""
Crie uma app que gere 100 000 num random e adicione os números a uma lista 

a) adicione já no lugar correto (mantendo sempre a lista ordenada)
b) adicione no final e ordene a lista

qual tem melhor desempenho ?

"""