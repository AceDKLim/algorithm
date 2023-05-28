from collections import deque
from sys import stdin

input = stdin.readline

n, m = map(int, input().split())

table = [[0 for _ in range(n + 1)]]
for i in range(1, n + 1):
    l = [0] + list(map(int, input().split()))

    # row 합치기
    for j in range(1, n + 1):
        l[j] = l[j - 1] + l[j]

    # column 합치기
    for j in range(1, n + 1):
        l[j] = l[j] + table[i - 1][j]
    table.append(l)


for _ in range(m):
    x1, y1, x2, y2 = map(int, input().split())
    s = table[x2][y2] - table[x1 - 1][y2] - table[x2][y1 - 1] + table[x1 - 1][y1 - 1]
    print(s)
