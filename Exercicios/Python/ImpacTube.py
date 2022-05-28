qtd = int(input())

lista = []

for i in range(0, qtd):
    infos = input().split(';')
    lista.append(infos)

conteudoP = float(input())
conteudoN = float(input())

resutados = []

for i in range(0, qtd):
    v = [lista[i][0], int(lista[i][1]), float(lista[i][2])]
    acumula = 0

    if v[1] < 1000:
        v = [lista[i][0], float(lista[i][2])]

    elif lista[i][3] == 'sim':
        while v[1] >= 1000:
            v[1] -= 1000
            acumula += conteudoP
        v = [lista[i][0], float(acumula + v[2])]

    elif lista[i][3] == 'não':
        while v[1] >= 1000:
            v[1] -= 1000
            acumula += conteudoN
        v = [lista[i][0], float(acumula + v[2])]

    resutados.append(v)


print('-----')
print('BÔNUS')
print('-----')

for v in resutados:
    print(f'{v[0]}: R$ {v[1]:.2f}')