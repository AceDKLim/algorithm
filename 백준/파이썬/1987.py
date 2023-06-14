def dfs(x, y, cnt):
    global result
    visit.append(alpha[x][y])
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= r or ny >= c:
            continue
        if alpha[nx][ny] not in visit:
            dfs(nx, ny, cnt + 1)
    visit.pop()
    result = max(result, cnt)


from sys import stdin

input = stdin.readline
r, c = map(int, input().split())

alpha = list(list(input().rstrip()) for _ in range(r))
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]
visit = []
result = 0

dfs(0, 0, 1)
print(result)
