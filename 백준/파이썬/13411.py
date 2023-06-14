n = int(input())

result = []
for i in range(1, n + 1):
    x, y, v = map(int, input().split())
    result.append(((x**2 + y**2) ** 0.5 / v, i))

result.sort()
for i in range(n):
    print(result[i][1])
