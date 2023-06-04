def queen(x, y):
    for i in range(0, x):
        chess[i][y] = 1
    for i in range(x, n):
        chess[i][y] = 1
    for i in range(0, y):
        chess[x][i] = 1
    for i in range(y, n):
        chess[x][i] = 1
    i = 1
    while x - i >= 0 and y - i >= 0:
        chess[x - i][y - i] = 1
        i += 1
    i = 1
    while x + i < n and y + i < n:
        chess[x + i][y + i] = 1
        i += 1


def move(a, b):
    cnt = 1
    queen(a, b)
    print(a, b)
    for i in range(n):
        for j in range(n):
            if chess[i][j] == 0:
                print(i, j)
                cnt += 1
                queen(i, j)
    if cnt >= n - 1:
        return 1
    return 0


n = int(input())
result = 0
for i in range(n):
    for j in range(n):
        chess = [[0 for _ in range(n)] for _ in range(n)]
        result += move(i, j)
        print()

print(result)
