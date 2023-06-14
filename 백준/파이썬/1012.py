import sys

sys.setrecursionlimit(10**6)
t = int(input())


def dfs(x, y):
    if x < 0 or x >= n or y < 0 or y >= m:
        return 0
    if farm[x][y] == 1:
        farm[x][y] = 0
        dfs((x + 1), y)
        dfs((x - 1), y)
        dfs(x, (y + 1))
        dfs(x, (y - 1))
        return 1
    return 0


for _ in range(t):
    m, n, k = map(int, input().split())
    farm = [[0] * m for _ in range(n)]

    cnt = 0
    for _ in range(k):
        y, x = map(int, input().split())
        farm[x][y] = 1
    for i in range(n):
        for j in range(m):
            if dfs(i, j) == 1:
                cnt += 1
    print(cnt)
