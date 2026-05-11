nomes = [
    "Ana", "João", "Maria",  "Pedro",  "Inês",
    "Miguel", "Catarina",  "Tiago",  "Sofia",   "Diogo",
    "Beatriz", "Ricardo", "Matilde",   "André",  "Mariana",
    "Gonçalo",  "Leonor",  "Francisco", "Carolina",
    "Tomás", "Rita",   "David",  "Sara",  "Luís",  "Clara"
]

# nomes[lb : up]
print(nomes[:5]) # do 0 ate 5-1 # [:n] -> 0 ate n-1

print(nomes[5:]) # do 5 ate fim # [n:] -> n ate fim

print(nomes[5:10]) # do 5 ate 10-1 # [n:m] -> n ate m-1


print(nomes[:]) # lista toda

print("-------------")

print(nomes[5:10]) # do 5 ate 10-1 # [n:m] -> n ate m-1

print(nomes[5:10:2]) # do 5 ate 10-1 de 2 em 2 # [n:m:s] -> n ate m-1 com step de s

print(nomes[::-1])

print(nomes[10:5:-1])

print("-------------")

print(nomes[-1])


# nomes tem 25 elm
# print(nomes[25]) # --> Erro

print(nomes[-25])

print(nomes[-1]) # -> ultimo
print(nomes[0]) # -> 1º

"""

             0           1           2
 f =     [ "fruta 1",  "fruta 2", "fruta 3"]
        0           1           2
      fruta 2,    fruta 1     fruta 3

f[-1] = "fruta 4"


[ "fruta 1",  "fruta 2", "fruta 4"]
"""

print("-------------")

