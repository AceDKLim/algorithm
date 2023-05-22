pado = [1, 1, 1]

for i in range(2, 101):
    pado.append(pado[i - 1] + pado[i - 2])

t = int(input())
for _ in range(t):
    print(pado[int(input()) - 1])
