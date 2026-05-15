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

print(pessoa.get("estado", "Sem Estado"))