n = int(input())

chess = [[0 for _ in range(n)] for _ in range(n)]
cnt = 0


def queen(x, y):
    if x <= n or y <= n:
        return
    if chess[x][y] == 0:
        cnt += 1
        move(0, 0)
        if x == n - 1:
            queen(0, y + 1)
        else:
            queen(x + 1, y)


def move(a,b):
    for i in range(n):
        chess[a][i]=0
        chess[i][b]=0
    while 
        