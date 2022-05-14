'''
Entrada
    Um número real positivo na primeira linha, indicando o preço da mercadoria, e um número inteiro positivo na segunda
    linha, indicando a quantidade comprada da mercadoria.
Saída
    Na primeira linha deve ser impresso um valor real com duas casas decimais, indicando o preço da compra sem o desconto
    e, na segunda linha, o preço final com o desconto aplicado, também com duas casas decimais.
'''

a = float(input())
b = int(input())

preco = a * b
desc = preco - (preco * (10 + b) / 100)

print(f'{preco:.2f}')
print(f'{desc:.2f}')