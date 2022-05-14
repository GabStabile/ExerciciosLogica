'''
Entrada
    Diversos números reais, um por linha, que representam os valores das doações feitas em Vic Coin. A entrada é finalizada quando o número -1.0 for lido e, evidentemente, não deverá ser contabilizado como doação.
Saída
    A saída será composta de duas linhas:
    A primeira linha será um número real com duas casas decimais indicando o total doado em Vic Coins (VC$);
    A segunda linha será um número real com duas casas decimais indicando o total doado em reais (R$).
'''

vic = float(input())
t = 0

while vic >= 0:
    t = t + vic
    vic = float(input())

print(f'VC$ {t:.2f}')
print(f'R$ {t * 2.50:.2f}')