
# *args <- param por pos -> tuple

def teste(*args):
    print(args)

lst = [1,2,4,4,5,6,7,1]
teste(*lst)

teste(1, "Teste", True)



# **kwargs <- param com nome -> dict
def teste2(**kwargs):
    print(kwargs["nome"])
    print(kwargs)


teste2(nome="Gonçalo", media=10, aprovado=True)


print("------")
def teste3(*args, **kwargs):
    print(args)
    print(kwargs)


teste3(12,1,31,nome="Gonçalo", aprovado=True )


