val = int(input())
cont = 0
qtd = 0
lista = []

while val > 0:
    qtd += 1
    cont += val
    lista.append(val)
    val = int(input())

media = cont / qtd
print(f'MEDIA: {media:.2f}')

for i in lista:
    if i < media:
        print(i)


