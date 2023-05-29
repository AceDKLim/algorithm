from sys import stdin

input = stdin.readline

n = int(input())

m = [0]
d = []
h = tuple(map(int, input().split()))
d.append(h[0])
d.append(h[1])
m.append(h)
for i in range(n - 1):
    h = tuple(map(int, input().split()))
    m.append(h)
    d.append(h[1])

INF = 1e9
dp = [[INF for _ in range(n + 1)] for _ in range(n + 1)]
for i in range(n + 1):
    dp[i][i] = 0
for t in range(1, n):
    for i in range(1, n - t + 1):
        j = i + t
        for k in range(i, j):
            dp[i][j] = min(dp[i][j], dp[i][k] + dp[k + 1][j] + (d[i - 1] * d[k] * d[j]))
print(dp[1][n])
