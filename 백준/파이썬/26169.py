def dfs(x, y, n, cnt):
    if n >= 3:
        return 0
    if apple[x][y] == 1:
        cnt += 1
    apple[x][y] = -1
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= 5 or ny >= 5:
            continue
        if apple[nx][ny] == -1:
            continue
        cnt = dfs(nx, ny, n + 1, cnt)
    return cnt


apple = list(list(map(int, input().split())) for _ in range(5))
x, y = map(int, input().split())
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

print(dfs(x, y, 0, 0))
# if cnt >= 2:
#     print(1)
# else:
#     print(0)
