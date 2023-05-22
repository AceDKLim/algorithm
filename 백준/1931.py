from sys import stdin

input = stdin.readline

n = int(input())
book = []
for _ in range(n):
    book.append(tuple(map(int, input().split())))
book = tuple(book)

m = 0
for i in range(n // 2):
    pick = book[i][1]
    cnt = 1
    for j in range(n):
        if book[j][0] > pick:
            cnt += 1
            pick = book[j][1]
    if cnt > m:
        m = cnt

print(m)
