def dfs(x, y):
    global cnt
    visit[x][y] = 1
    if campus[x][y] == "P":
        cnt += 1
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= n or ny >= m:
            continue
        if visit[nx][ny] == 0 and campus[nx][ny] != "X":
            dfs(nx, ny)


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline
n, m = map(int, input().split())

visit = [[0 for _ in range(m)] for _ in range(n)]
campus = []

sx, sy = 0, 0
for i in range(n):
    t = list(input().rstrip())
    if "I" in t:
        sx, sy = i, t.index("I")
    campus.append(t)

dx = [1, -1, 0, 0]
dy = [0, 0, -1, 1]

cnt = 0
dfs(sx, sy)
if cnt == 0:
    print("TT")
else:
    print(cnt)
