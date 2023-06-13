from collections import deque

n, m = map(int, input().split())

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

g = list(list(input()) for _ in range(n))
visit = [[0] * m for _ in range(n)]

q = deque([(0, 0)])

while q:
    x, y = q.popleft()
    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        if nx < 0 or ny < 0 or nx >= n or ny >= m:
            continue
        if visit[nx][ny] == 0 and g[nx][ny] == "0":
            visit[nx][ny] = visit[x][y] + 1
            q.append((nx, ny))
print(g)
print(visit)
