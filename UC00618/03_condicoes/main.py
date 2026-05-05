from unittest import case

idade = 20

if idade == 20:
    print("20 anos")


idade = 10


"""
Crie uma app que receba 2 num e diga qual o maior 
"""

if idade > 18:
    print("adulto")
elif idade > 12:
    print("teen")
else:
    print("kid")



n1 = 0 # int(input("Digite o primeiro numero: "))
n2 = 9 # int(input("Digite o segundo numero: "))


if n1 > n2:
    print("o maior num é: ", n1)
else:
    print(f"o maior num é: {n2}")



"""
 ==
 >
 <
 >=
 <=

 !=

"""

num = 123

match num:
    case 1:
        print("1")
    case 2:
        print("2")
    case 10:
        print("10")
    case _:
        print("Outro valor")



