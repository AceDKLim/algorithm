from collections import deque

n, m = map(int, input().split())
miro = []
for _ in range(n):
    miro.append(list(input()))

d_x = [-1, 0, 0, 1]
d_y = [0, -1, 1, 0]


def bfs(x, y):
    que = deque()
    que.append((x, y))
    while que:
        x, y = que.popleft()
        for i in range(4):
            nx = x + d_x[i]
            ny = y + d_y[i]
            if nx < 0 or ny < 0 or nx >= n or ny >= m:
                continue
            if miro[nx][ny] == "0":
                continue
            if miro[nx][ny] == "1":
                miro[nx][ny] = int(miro[x][y]) + 1
                que.append((nx, ny))
    return miro[n - 1][m - 1]


print(bfs(0, 0))
