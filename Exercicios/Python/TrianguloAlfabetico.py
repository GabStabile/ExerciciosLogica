alfabeto = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']

n = int(input())

for i in range(0, n):
    if i == 0:
        print(alfabeto[i])
    elif i != 0:
        print(alfabeto[i] * (i + 1))
