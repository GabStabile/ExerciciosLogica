'''
Entrada
    Um número natural maior ou igual a dois.
Saída
    Dois números naturais, separados por um espaço, em que o primeiro é o número ímpar que antecede o valor dado na
    entrada e o segundo é o par que sucede o valor dado na entrada.
'''

x = int(input())

if x % 2 == 0:
    print((x - 1), (x + 2))
else:
    print((x - 2), (x + 1))