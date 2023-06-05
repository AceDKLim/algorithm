import heapq
from collections import deque

n, m = map(int, input().split())
g = list(map(int, input().split()))
gift = []
children = deque(map(int, input().split()))
for i in g:
    heapq.heappush(gift, -i)
result = 1
while children:
    c = children.popleft()
    g = -heapq.heappop(gift)
    if c <= g:
        g -= c
    else:
        result = 0
        break
    if g != 0:
        heapq.heappush(gift, -g)
print(result)
