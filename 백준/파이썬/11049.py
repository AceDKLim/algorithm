from sys import stdin

input = stdin.readline
n = int(input())
m = [0] + [tuple(map(int, input().split())) for _ in range(n)]

INF = 1e9
dp = [[INF for _ in range(n + 1)] for _ in range(n + 1)]
for i in range(n + 1):
    dp[i][i] = 0

for t in range(1, n):
    for i in range(1, n - t + 1):
        j = i + t
        for k in range(i, j):
            dp[i][j] = min(dp[i][j], dp[i][k] + dp[k + 1][j] + (m[i][0] * m[k][1] * m[j][1]))
print(dp[1][n])
