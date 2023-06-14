def dfs(x, y):
    if m[x][y] == 0:
        return False
    m[x][y] = 0
    for i in range(8):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= h or ny >= w:
            continue
        if m[nx][ny] == 1:
            dfs(nx, ny)
    return True


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline
dx = [0, 0, -1, 1, 1, -1, -1, 1]
dy = [1, -1, 0, 0, 1, 1, -1, -1]
while 1:
    w, h = map(int, input().split())
    if w == 0 and h == 0:
        break
    m = list(list(map(int, input().split())) for _ in range(h))
    cnt = 0
    for i in range(h):
        for j in range(w):
            if dfs(i, j):
                cnt += 1
    print(cnt)
