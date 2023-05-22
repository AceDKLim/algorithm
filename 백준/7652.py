from collections import deque

dx1 = [2, 1, -1, -2]
dy1 = [1, 2, 2, 1]
dx2 = [-2, -1, 1, 2]
dy2 = [-1, -2, -2, -1]


def bfs(sx, sy):
    que = deque()
    que.append((sx, sy))
    while que:
        x, y = que.popleft()
        if tx > x:
            dx = dx1
            dy = dy1
        else:
            dx = dx2
            dy = dy2
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or ny < 0 or nx >= l or ny >= l:
                continue
            que.append((nx, ny))
            chess[nx][ny] = min(chess[x][y] + 1, chess[nx][ny])
            print(*chess, sep="\n")
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
