def msg():
    print("Hello World")


msg()


def msg2(nome):
    print(f"Hello World, {nome}")


msg2("Gonçalo")
msg2("Ana")
msg2("Maria")


def msg3(nome: str):
    print(f"Hello World, {nome}")


msg3("Ana")
msg3(212)


def msg4(nome: str, ano: int):
    return f"Hello World, {nome} em {ano}"


m = msg4("Gonçalo", 2003)
j = msg4("Ana", 2026)

# m = "Hello World, Gonçalo em 2003"
print("------")
print(m)
print(j)
print("------")

"""

Crie uma func que recebe 2 num int e devolva o resultado da sua soma
calcule e mostre o dobro desse valor 

"""


def soma(num1: int, num2: int) -> int:
    return num1 + num2


res = soma(2, 4)
# opt 1
print(res * 2)
# opt 2
dobro = res * 2
print(dobro)

"""
def fazer_bolo(lista_ingredientes) -> Bolo:
    pass
"""


def soma2(num1: int, num2: int = 0) -> int:
    return num1*2 + num2*3
print("------")

print(soma2(2,3))
print(soma(2,3))
print("------")

print(soma2(2))
# print(soma(2)) # -> TypeError: soma() missing 1 required positional argument: 'num2'
print("------")


print(soma2(3,2))

print(soma2(num2=3, num1=2))

print("------")
print("------")
def soma4(num1: int, num2: int, num3:int, num4: int) -> int:
    print((num1*4) + (num2*8) + (num3*16) + (num4*32))



soma4(3,2,4,4)
soma4(num2=3, num1=2, num3=4, num4=4)
soma4(3,1, num4=50, num3=41)
soma4(3,1, 41, 50)


soma4(3,1, num4=50, num3=41, num1=312)