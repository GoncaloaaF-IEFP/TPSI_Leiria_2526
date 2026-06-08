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
    def __init__(self, nome:str, **kwargs):
        self.nome = nome
        # self.morada = Morada(rua, num, apt, cp, local)
        if 'morada' in kwargs:
            self.morada = kwargs['morada']
        else:
            self.morada = Morada(kwargs['rua'], kwargs['num'], kwargs['apt'], kwargs['cp'], kwargs['local'])




    """
    def __init__(self, nome:str, rua:str, num:str, apt:str, cp:str, local:str):
        self.nome = nome
        self.morada = Morada(rua, num, apt, cp, local)
    """