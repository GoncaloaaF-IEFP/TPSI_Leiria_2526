class Bola:

    def __init__(self,cor:str,circunferencia:float,material:str):
        self.cor = cor
        self.circunferencia = circunferencia
        self.material = material


    def trocaCor(self, nova_cor:str):
        self.cor = nova_cor

    def mostrarCor(self):
        print(f"a cor da bola é:  {self.cor}")
