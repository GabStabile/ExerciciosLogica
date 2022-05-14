'''
Entrada
    Dois números naturais, um em cada linha, que representam o ano INÍCIO e o ano FIM do intervalo considerado.
    Adote que (0 <= INÍCIO <= FIM <= 9999) sempre será verdade.
Saída
    Todos os anos bissextos do intervalo fechado [ INÍCIO..FIM ], um por linha. Ao final, o programa deve exibir a
    quantidade de anos bissextos, conforme os exemplos.
'''

INICIO = int(input())
FIM = int(input())
cont = 0

for i in range(INICIO, FIM + 1):
    if i % 4 == 0 and i % 100 != 0 or i % 400 == 0:
        cont = cont + 1
        print(i)

print(f'bissextos: {cont}')