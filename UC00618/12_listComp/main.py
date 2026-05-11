"""

lst = [exp(item) for item in list if condição ]
print(lst)]
"""




lst = [1,2,3,4,5,6]

"""
nova_lista = elm lst * 2

"""

"""
nova_lista = []

for elm in lst:
    if elm % 2 == 0:
        nova_lista.append(elm * 2)

print(lst)
print(nova_lista)

"""

nova_lista = [elm * 2 for elm in lst if elm % 2 == 0]


print(lst)
print(nova_lista)

nomes = [
    "Ana", "João", "Maria", "Pedro", "Inês",
    "Miguel", "Catarina", "Tiago", "Sofia", "Diogo",
    "Beatriz", "Ricardo", "Matilde", "André", "Mariana",
    "Gonçalo", "Leonor", "Francisco", "Carolina", "Tomás",
    "Rita", "David", "Sara", "Luís", "Clara"
]

nova_lista = [elm * 2 for elm in lst if elm % 2 == 0]


print(len(nomes[0]))

# Crie uma lista com o número de letras de cada nome em nomes

contar_letras = [len(nome) for nome in nomes]
print(contar_letras)

contar_letras = [nome.__len__() for nome in nomes]
print(contar_letras)

esconder = "---"
contar_letras = [esconder for nome in nomes]
print(contar_letras)


# Crie uma lista com o número de letras de cada nome terminados em "a" na lista nomes
contar_letras2 = [len(nome) for nome in nomes if nome[-1].lower() == "a"]

print(contar_letras2)


# Crie uma lista com o *nome e número de letras* correspondente de todos os nomes na lista nome com:
#   mais de 4 letras
print("------")
print("A")
contar_letras2 = [f"{nome} - {len(nome)}" for nome in nomes if len(nome) > 7]
print(*contar_letras2)



tp = ("Joao", 4)

nome, letras = tp

print(nome, letras)


print("----B------")

contar_letras3 = [(nome, len(nome)) for nome in nomes if len(nome) > 4]
for elm in contar_letras3:
    nome, letras = elm
    print(letras)

print("----B------")


# mostre o maior nome usando apenas a lista contar_letras3 sem usar o len
#caso A


max_name = contar_letras3[0]

for elm in contar_letras3:
    if elm[1] > max_name[1]:
        max_name = elm

print(max_name)



# mostre o maior nome usando apenas a lista contar_letras3 sem usar o len

max_name = contar_letras3[0]

for elm in contar_letras3:
    if elm[1] < max_name[1]:
        max_name = elm

print(max_name)

lst = [1,3,34,34,3,5,2,123,12,41,4,2135,215]
lst_size = 13
# encontre o maior num (sem usar o max)

max_val = lst[0]

for elm in lst:
    if elm > max_val :
        max_val = elm

print(max_val)