'''
Entrada
    Dois números naturais, INÍCIO e FIM, respectivamente, um por linha. Adote (INICIO <= FIM <= 5000).
Saída
    Os números primos presentes no intervalo fechado [ INÍCIO..FIM ] e a quantidade de números primos do intervalo,
    conforme o padrão exibido nos exemplos.
'''

INICIO = int(input())
FIM = int(input())
var = 0

for c in range(INICIO, FIM + 1):
    cont = 0

    for i in range(1, c + 1):
        if c % i == 0:
            cont = cont + 1
    if cont == 2:
        print(c)
        var = var + 1

print(f'primos: {var}')