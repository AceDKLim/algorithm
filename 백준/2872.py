from sys import stdin

input = stdin.readline

n = int(input())
book = list(int(input()) for _ in range(n))
book.reverse()
print(book)
cnt = 0
while book != sorted(book, reverse=1):
    for i in range(n - 1):
        if book[i - 1] < book[i]:
            book.append(book.pop())
            cnt += 1
            break
print(cnt)
