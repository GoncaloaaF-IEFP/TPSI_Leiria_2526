
"""
Classe Bola: Crie uma classe que modele uma bola:
    Atributos: Cor, circunferência, material

"""


"""
Crie 3 instancias de Bola
"""

bola1 = Bola("Amarelo", 21, "plastico")
bola2 = Bola("Azul", 12, "Borracha")
bola3 = Bola("Vermelho", 10, "Pano")

"""
Mostre a cor e o material de todas as bola 
"""
print("------")


print(f"{bola1.cor} - {bola1.material}")
print(f"{bola2.cor} - {bola2.material}")
print(f"{bola3.cor} - {bola3.material}")


"""
Crie uma lista com as bolas e mostre a cor e o material de todas as bola na lista
"""

print("------")

lst = [bola1, bola2, bola3]

for bola in lst:
    print(f"{bola.cor} - {bola.material}")


"""
adicione
    Métodos: trocaCor e mostraCor
"""