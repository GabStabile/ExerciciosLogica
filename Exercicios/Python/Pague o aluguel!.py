'''
Entrada
    Dois números inteiros positivos, o primeiro representa o valor total da dívida e o segundo o valor que Ramón poderá pagar mensalmente.
Saída
    O número do pagamento, o valor restante da dívida antes do pagamento mensal e o valor restante da dívida após o
    pagamento mensal, conforme o padrão exibido nos exemplos. A exibição deve continuar até que a dívida seja quitada.
'''

divida = int(input())
pagamentomes = int(input())

pagamento = 0

if divida < pagamentomes:
    print('pagamento: 1')
    print(f'antes = {divida}')
    print('depois = 0')
    print('-' * 5)

else:
    while divida != 0 and divida > 1:
        pagamento += 1
        print(f'pagamento: {pagamento}')
        print(f'antes = {divida}')
        divida -= pagamentomes
        print(f'depois = {divida}')
        print('-' * 5)
        if divida < pagamentomes and divida != 0:
            pagamento += 1
            print(f'pagamento: {pagamento}')
            print(f'antes = {divida}')
            divida = 0
            print(f'depois = {divida}')
            print('-' * 5)