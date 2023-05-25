def row(i, j):
    if sudoku[i][j] != 0:
        return 1
    if sudoku[i].count(0) == 1:
        sudoku[i][j] = 45 - sum(sudoku[i])
        return 1
    return 0


def vertical(i, j):
    if sudoku[i][j] != 0:
        return 1
    v_list = []
    for k in range(9):
        v_list.append(sudoku[k][j])
    if v_list.count(0) == 1:
        sudoku[i][j] = 45 - sum(v_list)
        return 1
    return 0


def square(i, j):
    if sudoku[i][j] != 0:
        return 1
    if i < 0 or j < 0 or i >= 8 or j >= 8:
        return 0
    s = []
    for k in range(-1, 2):
        for m in range(-1, 2):
            s.append(sudoku[i + m][j + k])
    if s.count(0) == 1:
        sudoku[i][j] = 45 - sum(s)
        return 1
    return 0


sudoku = []
zero = []

for i in range(9):
    s = list(map(int, input().split()))
    if 0 in s:
        for j in range(9):
            if s[j] == 0:
                zero.append((i, j))
    sudoku.append(s)

while zero:
    i, j = zero[0]
    a = row(i, j)
    if a == 0:
        b = vertical(i, j)
        if b == 0:
            c = square(i, j)
        else:
            zero.pop(0)
    else:
        zero.pop(0)

for i in range(9):
    print(*sudoku[i])
