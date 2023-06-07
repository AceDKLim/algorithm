from collections import deque
import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n, m = map(int, input().split())

g = []
for i in range(n):
    num = list(map(int, input().split()))
    if 2 in num:
        x, y = i, num.index(2)
    g.append(num)

visit = deque()
g[x][y] = 0
visit.append((x, y))
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]
while visit:
    x, y = visit.popleft()
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= n or ny >= m:
            continue
        if g[nx][ny] == 1:
            g[nx][ny] = str(int(g[x][y]) + 1)
            visit.append((nx, ny))

for i in range(n):
    for j in range(m):
        if g[i][j] == 1:
            print(-1, end=" ")
        else:
            print(g[i][j], end=" ")
    print()
