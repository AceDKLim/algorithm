from collections import deque

dx = [2, 1, -1, -2, -2, -1, 1, 2]
dy = [1, 2, 2, 1, -1, -2, -2, -1]


def bfs(sx, sy):
    if sx == tx and sy == ty:
        return 0
    que = deque()
    que.append((sx, sy))
    while que:
        x, y = que.popleft()
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or ny < 0 or nx >= l or ny >= l:
                continue
            if chess[nx][ny] == INF:
                chess[nx][ny] = chess[x][y] + 1
                que.append((nx, ny))
                if nx == tx and ny == ty:
                    return chess[tx][ty]


t = int(input())
INF = int(1e9)
for _ in range(t):
    l = int(input())
    sx, sy = map(int, input().split())
    tx, ty = map(int, input().split())
    chess = [[INF] * (l + 1) for _ in range(l + 1)]
    chess[sx][sy] = 0
    print(bfs(sx, sy))
