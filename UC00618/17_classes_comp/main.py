from modelos import Morada, Pessoa







def criar_morada(morada:Morada):
    return morada

#def criar_morada(rua:str, num:int, apt:str, cp:str, local:str):
#    return Morada(rua, num, apt, cp, local)













m = Morada("rua x", "12", "4C", "1100-123", "Lisboa")



p = Pessoa("Gonçalo", Morada("rua x", "12", "4C", "1100-123", "Lisboa"))

print(p.nome)
print(p.morada.rua)
print(p.morada)



# p = Pessoa("Gonçalo", m)
# p = Pessoa("Gonçalo", "rua x", "12", "4C", "1100-123", "Lisboa")