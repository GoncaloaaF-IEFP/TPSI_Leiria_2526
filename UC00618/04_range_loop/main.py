
num_max = 10
curr = 0


while curr < num_max:
    print(curr)
    curr += 2 # curr = curr + 2


# contador de 10 a 0

num_min = 0
curr = 10
while curr >= num_min:
    print(curr)
    curr -= 1



print("----------------")

num_max = 100

print("Linha 1")

while num_max > 0:
    print(num_max)
    num_max -= 10

    if num_max == 50:
        break     # terminar o loop


print("Linha 2")

print("----------------")


"""

loop que me mostre os num pares entre 1 e 50 
    usar inc de 1 a cada volta
    
"""


i = 1

while i <= 50:
    if i % 2 == 0:
        print(i)
    i += 1





