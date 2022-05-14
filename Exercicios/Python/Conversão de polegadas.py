'''
Entrada
    Um número real representando as polegadas.
Saída
    Um número real, com três casas decimais, representando a conversão das polegadas da entrada em centímetros.
'''

polegada = float(input())

calc = 2.54 * polegada

print(f'{calc:.3f}')

