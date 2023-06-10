from collections import deque

n, m = map(int, input().split())
books = sorted(map(int, input().split()))
m_books = deque([])
p_books = deque([])

for i in books:
    if i < 0:
        m_books.append(i)
    else:
        p_books.appendleft(i)

a = b = 0
for i in range(min(m, len(m_books))):
    a += m_books[i]

for i in range(min(m, len(p_books))):
    b += p_books[i]

if abs(a) > b:
    result = abs(m_books.popleft())
    for _ in range(min(m - 1, len(m_books))):
        m_books.popleft()
else:
    result = p_books.popleft()
    for _ in range(min(m - 1, len(p_books))):
        p_books.popleft()

for i in range(0, len(m_books), m):
    result += abs(m_books[i]) * 2

for i in range(0, len(p_books), m):
    result += p_books[i] * 2

print(result)
