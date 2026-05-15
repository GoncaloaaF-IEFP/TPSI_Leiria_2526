pessoa = {
    "nome": "Pedro",
    "idade": 25,
    "escola":"IEFP",
}

print(pessoa)
print(pessoa["nome"])

pessoa["idade"] = 30
print(pessoa)

pessoa["Estado"] = True
print(pessoa)


# print(pessoa["estado"]) # KeyError: 'estado'

print(pessoa.get("estado", True))

#                   |
#                   |
#                   V
print(pessoa.pop("idade")) # 38
print(pessoa)

print(pessoa.popitem()) # ('Estado', True)
print(pessoa)


del pessoa["escola"]
print(pessoa)

del pessoa["nome"]
print(pessoa)


pessoa = {
    "nome": "Pedro",
    "idade": 25,
    "escola":"IEFP",
}

# del pessoa
# print(pessoa)

print(pessoa.keys())
print(pessoa.values())
print(pessoa.items())

# iterar

for elm in pessoa: # mostra as keys
    print(elm)

print("----")
for elm in pessoa.values(): # mostra as keys
    print(elm)

print("----")
for elm in pessoa.items(): # mostra as keys
    print(elm)

