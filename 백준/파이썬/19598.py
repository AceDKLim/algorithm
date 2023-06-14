import heapq
from sys import stdin

input = stdin.readline
n = int(input())
meet = []

for _ in range(n):
    a, b = map(int, input().split())
    heapq.heappush(meet, (b, a))

book = [heapq.heappop(meet)[0]]
while meet:
    e, s = heapq.heappop(meet)
    m = heapq.heappop(book)
    if s >= m:
        heapq.heappush(book, e)
    else:
        heapq.heappush(book, m)
        heapq.heappush(meet, (e, s))

print(len(book))
