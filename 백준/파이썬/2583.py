def dfs(x, y):
    global cnt
    paper[x][y] = 1
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= n or ny >= m:
            continue
        if paper[nx][ny] == 0:
            dfs(nx, ny)
            cnt += 1


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline
m, n, k = map(int, input().split())

paper = [[0 for _ in range(m)] for _ in range(n)]

for _ in range(k):
    x1, y1, x2, y2 = map(int, input().split())
    for i in range(x1, x2):
        for j in range(y1, y2):
            paper[i][j] = 1

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]
result = []
for i in range(n):
    for j in range(m):
        if paper[i][j] == 0:
            cnt = 1
            dfs(i, j)
            result.append(cnt)
result.sort()
print(len(result))
print(*result)
