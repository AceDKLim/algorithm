def dfs(x, y):
    visit[x][y] += 1
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= n or ny >= m:
            continue
        if map[nx][ny] < map[x][y]:
            dfs(nx, ny)


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n, m = map(int, input().split())
map = list(list(map(int, input().split())) for _ in range(n))

visit = [[0 for _ in range(m)] for _ in range(n)]
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]
dfs(0, 0)

print(visit[n - 1][m - 1])
