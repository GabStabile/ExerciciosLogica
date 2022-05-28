o = int(input())

original = []

for i in range(0, o):
    original.append(float(input()))

final = []

for i in range(0, o):
    final.append(float(input()))

alteradas = 0
linha = []

for i in range(0, o):
    if final[i] == 10 and original[i] != 10:
        final[i] = original[i] + 2
        alteradas += 1

    else:
        final[i] = original[i]

for i in range(0, o):
    if final[i] > 10:
        final[i] = 10

print(f'NOTAS ALTERADAS: {alteradas}')

for i in range(0, o):
    if original[i] != final[i]:
        print(f'*({i+1:03d}) original: {original[i]:0>5.2f} | final: {final[i]:0>5.2f}')
    else:
        print(f'-({i + 1:03d}) original: {original[i]:0>5.2f} | final: {final[i]:0>5.2f}')