from Bola import Bola
from Carro import Carro


c1 = Carro("Amarelo", 1.6)
print("c1",c1.cor)
print("c1",c1.motor)


c2 = Carro("Rosa", 2.0)
print("c2",c2.cor)
print("c2",c2.motor)


c3 = c1
print("c3",c3.cor)
print("c3",c3.motor)

c3.motor = 1.8
print("c3",c3.motor)
print("c1",c1.motor)



c1.aclarar()
c2.aclarar()