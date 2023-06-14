n = int(input())
book = {}
for i in range(n):
    b = input()
    if b in book:
        book[b] += 1
    else:
        book[b] = 1

book = sorted(book.items(), key=lambda x: (-x[1], x[0]))
print(book[0][0])
