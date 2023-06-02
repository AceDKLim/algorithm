def dfs(x, y):
    if p[x][y] == "0":
        p[x][y] = "2"
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= n or ny >= m:
            continue
        if p[nx][ny] == "0":
            dfs(nx, ny)
    return


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline
n, m = map(int, input().split())

p = list(list(input()) for _ in range(n))
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

for i in range(m):
    dfs(0, i)

result = "NO"
if "2" in p[n - 1]:
    result = "YES"
print(result)
