n = int(input())
game = []
visit = [[0] * n for _ in range(n)]
for _ in range(n):
    game.append(list(map(int, input().split())))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def dfs(x, y, n):
    result = 0
    num = game[x][y]
    visit[x][y] = 1

    if num == -1:
        return 1

    for i in range(4):
        nx = x + (num * dx[i])
        ny = y + (num * dy[i])
        if nx < 0 or ny < 0 or nx >= n or ny >= n:
            continue
        if visit[nx][ny] == 1:
            continue
        result += dfs(x + num * dx[i], y + num * dy[i], n)
        visit[x][y] = 0
    return result


if dfs(0, 0, n) == 1:
    print("HaruHaru")
else:
    print("Hing")
