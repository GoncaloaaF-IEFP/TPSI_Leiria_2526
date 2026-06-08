from modelos import Morada, Pessoa







def criar_morada(morada:Morada):
    return morada

#def criar_morada(rua:str, num:int, apt:str, cp:str, local:str):
#    return Morada(rua, num, apt, cp, local)













m = Morada("rua x", "12", "4C", "1100-123", "Lisboa")

# p0 = Pessoa("Gonçalo", "rua xC", "12C", "4CC", "1100-123C", "LisboaC")
#p1 = Pessoa("Gonçalo", Morada("rua a", "12a", "4Ca", "1100-123a", "Lisboaa"))
#p2 = Pessoa("Gonçalo", m)


#print(p1.morada)
#print(p2.morada)

# p = Pessoa("Gonçalo", Morada("rua x", "12", "4C", "1100-123", "Lisboa"))

#p = Pessoa("Gonçalo", m)

# p = Pessoa("Gonçalo", "rua x", "12", "4C", "1100-123", "Lisboa")


print("---------------")

p1 = Pessoa("Gonçalo", morada=m)
p2 = Pessoa("Maria", morada=m)
print(p1.morada)
print(p2.morada)

p2 = Pessoa("Maria", rua="Rua xpto", apt="apt xpto", cp="1234-123", local="Lisboa", num="12C")
print(p2.morada)