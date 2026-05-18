class Carro:

    def __init__(self,cor:str,motor:float):
        self.cor = cor
        self.motor = motor
        self.em_movimento = False

    def aclarar(self):
        self.em_movimento = True
        print(f"o carro {self.cor} esta a aclarar")

    def travar(self):
        self.em_movimento = False
        print(f"o carro {self.cor} esta a travar")