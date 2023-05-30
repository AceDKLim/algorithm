n = int(input())
m = int(input())
INF = 1e9

city = [[INF for _ in range(n + 1)] for _ in range(n + 1)]

for _ in range(m):
    a, b, c = map(int, input().split())
    city[a][b] = min(city[a][b], c)

for i in range(1, n + 1):
    for j in range(1, n + 1):
        for k in range(1, n + 1):
            city[j][k] = min(city[j][k], city[j][i] + city[i][k])

for i in range(1, n + 1):
    for j in range(1, n + 1):
        if city[i][j] == INF or i == j:
            city[i][j] = 0
        print(city[i][j], end=" ")
    print()
