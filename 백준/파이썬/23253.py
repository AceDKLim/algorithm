from sys import stdin

input = stdin.readline
n, m = map(int, input().split())

book = []
for _ in range(m):
    i = input()
    book.append(list(map(int, input().split())))

for i in range(1, n + 1):
    check = 0
    for j in range(m):
        if len(book[j]) != 0 and book[j][-1] == i:
            check = 1
            book[j].pop()
            continue
    if check == 0:
        break


result = "Yes"
for i in book:
    if len(i) != 0:
        result = "No"
print(result)
