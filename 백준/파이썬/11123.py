def dfs(x, y):
    if sheep[x][y] == "0" or sheep[x][y] == ".":
        return False
    sheep[x][y] = "0"
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= w or ny >= h:
            continue
        if sheep[nx][ny] == "#":
            dfs(nx, ny)
    return True


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline

t = int(input())
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]
for _ in range(t):
    w, h = map(int, input().split())
    sheep = list(list(input()) for _ in range(w))
    cnt = 0
    for i in range(w):
        for j in range(h):
            if dfs(i, j):
                cnt += 1
    print(cnt)
