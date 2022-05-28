primeiro = input()
valores = []

for v in primeiro.split():
    valores.append(int(v))

caso = input().split()

while caso[0] != 'encerrar':

    apagar = []
    if caso[0] == 'adicionar':
        valores.append(int(caso[1]))

    elif caso[0] == 'remover':

        apagar.append(int(caso[1]))
        if apagar[0] in valores:
            valores.remove(int(apagar[0]))
        else:
            print(f'código {caso[1]} não encontrado')

    elif caso[0] == 'exibir':
        valores.sort()
        print(*valores)

    caso = input().split()

valores.sort()
print(*valores)