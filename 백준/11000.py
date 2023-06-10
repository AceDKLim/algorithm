import heapq
from sys import stdin

input = stdin.readline
n = int(input())
study = []

for _ in range(n):
    a, b = map(int, input().split())
    heapq.heappush(study, (b, a))

book = [heapq.heappop(study)[0]]
while study:
    e, s = heapq.heappop(study)
    m = heapq.heappop(book)
    if s >= m:
        heapq.heappush(book, e)
    else:
        heapq.heappush(book, m)
        heapq.heappush(book, e)

print(len(book))
