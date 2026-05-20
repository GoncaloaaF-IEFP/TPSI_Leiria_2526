class Morada:
    def __init__(self, rua:str, num:str, apt:str, cp:str, local:str):
        self.rua = rua
        self.num = num
        self.apt = apt
        self.cp = cp
        self.local = local

    def __str__(self):
        return f'Morada: {self.rua} {self.num} {self.apt} {self.cp} {self.local}'


class Pessoa(object):
    def __init__(self, nome:str, morada:Morada):
        self.nome = nome
        self.morada = morada