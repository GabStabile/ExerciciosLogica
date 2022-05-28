A = int(input())
B = int(input())

for i in range(A, B+1):
    for c in range(1, 11):
        print(f'{i} x {c} = {i*c}')
    print('-' * 10)

if A > B:
    print('Nenhuma tabuada no intervalo!')



