def dfs(x, y):
    m[x][y] = 0
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= n or ny >= n:
            continue
        if m[nx][ny] > n:
            dfs(nx, ny)


n = int(input())
m = list(list(map(int, input().split())) for _ in range(n))
cnt = 0
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]
for i in range(n):
    for j in range(n):
        if m[i][j] > n:
            cnt += 1
            dfs(i, j)
print(cnt)
