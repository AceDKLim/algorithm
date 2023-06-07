def dfs(x, y):
    h[x][y] = 0
    for i in range(8):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= n or ny >= m:
            continue
        if h[nx][ny] == 1:
            dfs(nx, ny)


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline
n, m = map(int, input().split())
h = list(list(map(int, input().split())) for _ in range(n))
dx = [1, 1, 0, -1, -1, -1, 0, 1]
dy = [0, 1, 1, 1, 0, -1, -1, -1]
cnt = 0
for i in range(n):
    for j in range(m):
        if h[i][j] == 1:
            cnt += 1
            dfs(i, j)
print(cnt)
