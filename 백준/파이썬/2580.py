def row(i, n):
    if n in sudoku[i]:
        return False
    return True


def vertical(j, n):
    for k in range(9):
        if sudoku[k][j] == n:
            return False
    return True


def square(i, j, n):
    x = i // 3 * 3
    y = j // 3 * 3
    for k in range(3):
        for m in range(3):
            if n == sudoku[x + k][y + m]:
                return False
    return True


def sudo(k):
    if k == len(zero):
        for i in range(9):
            print(*sudoku[i])
        return

    for n in range(1, 10):
        x = zero[k][0]
        y = zero[k][1]

        if row(x, n) and vertical(y, n) and square(x, y, n):
            sudoku[x][y] = n
            sudo(k + 1)
            sudoku[x][y] = 0


from sys import stdin

input = stdin.readline

sudoku = []
zero = []

for i in range(9):
    s = list(map(int, input().split()))
    for j in range(9):
        if s[j] == 0:
            zero.append((i, j))
    sudoku.append(s)


sudo(0)
