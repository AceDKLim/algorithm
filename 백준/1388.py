def dfs(x, y):
    if graph[x][y] == 0:
        return 0
    dx = [1, -1]
    dy = [0, 0]
    if graph[x][y] == "-":
        dx, dy = dy, dx
    g = graph[x][y]
    graph[x][y] = 0
    for i in range(2):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= n or ny >= m:
            continue
        if graph[nx][ny] == 0:
            continue
        if graph[nx][ny] == g:
            dfs(nx, ny)
    return True


n, m = map(int, input().split())
graph = []
for _ in range(n):
    graph.append(list(input()))

cnt = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j):
            cnt += 1
print(cnt)
