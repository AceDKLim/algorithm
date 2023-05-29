from sys import stdin

input = stdin.readline

n = int(input())
book = []
for _ in range(n):
    book.append(tuple(map(int, input().split())))

# 끝나는 시간 순으로 정렬, 같으면 시작 시간 빠른 순으로

book.sort(key=lambda x: (x[1], x[0]))
pick = book[0][1]
cnt = 1
for i in range(1, n):
    if book[i][0] >= pick:
        cnt += 1
        pick = book[i][1]

print(cnt)
