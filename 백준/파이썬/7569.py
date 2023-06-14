from collections import deque

n, m, h = map(int, input().split())
tomato = []
ones = deque()
for i in range(h):
    t = []
    for j in range(m):
        l = list(map(int, input().split()))
        for k in range(n):
            if l[k] == 1:
                ones.append((i, j, k))
        t.append(l)
    tomato.append(t)

dx = [0, 0, 0, 0, 1, -1]
dy = [0, 0, 1, -1, 0, 0]
dz = [1, -1, 0, 0, 0, 0]
while ones:
    z, y, x = ones.popleft()
    for i in range(6):
        nx = x + dx[i]
        ny = y + dy[i]
        nz = z + dz[i]
        if nx < 0 or ny < 0 or nz < 0 or nx >= n or ny >= m or nz >= h:
            continue
        if tomato[nz][ny][nx] == 0:
            tomato[nz][ny][nx] = tomato[z][y][x] + 1
            ones.append((nz, ny, nx))

result = 0
cnt = 0
for i in tomato:
    for j in i:
        if 0 in j:
            cnt += 1
        if max(j) > result:
            result = max(j)
if cnt != 0:
    print(-1)
else:
    print(result - 1)
