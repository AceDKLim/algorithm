from collections import deque

# 입력 받아서 양, 음수로 쪼개기
n, m = map(int, input().split())
books = sorted(map(int, input().split()))
m_books = deque([])
p_books = deque([])

for i in books:
    if i < 0:
        m_books.append(i)
    else:
        p_books.appendleft(i)

# 양수 m개와 음수 m개중 뭐가 더 큰지 파악
if abs(m_books[0]) > p_books[0]:
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
