def dfs(x, y):
    global count
    color = war[x][y]
    war[x][y] = 0
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= n or ny >= m:
            continue
        if war[nx][ny] == color:
            count += 1
            dfs(nx, ny)


m, n = map(int, input().split())

war = list(list(input()) for _ in range(n))
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]
w = 0
b = 0
for i in range(n):
    for j in range(m):
        if war[i][j] == "W":
            count = 1
            dfs(i, j)
            w += count**2
        elif war[i][j] == "B":
            count = 1
            dfs(i, j)
            b += count**2
print(w, b)
