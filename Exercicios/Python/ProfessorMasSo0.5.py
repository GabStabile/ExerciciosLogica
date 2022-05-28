'''
Entrada
    Dois números reais que podem variar de 0.00 à 10.00, um por linha, que representam a nota de trabalhos e a nota da
    prova regular, respectivamente.

Saída
    Uma frase indicando a situação do aluno a quem pertencem as notas da entrada. A situação pode ser 'aprovado',
    'reprovado' ou talvez com a sub', sem os apóstrofos e completamente em minúsculo. Veja nos exemplos como a saída
    deve ser exibida.
'''

t = float(input())
p = float(input())

m = (t + p) / 2

if m >= 6:
    print('aprovado')
elif t >= 2:
    print('talvez com a sub')
elif t < 2:
    print('reprovado')


