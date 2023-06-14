import heapq
import sys

input = sys.stdin.readline
n = int(input())

max_heap = []

for _ in range(n):
    c = int(input())
    if c == 0:
        try:
            print(heapq.heappop(max_heap)[1])
        except:
            print(0)
    else:
        heapq.heappush(max_heap, (-c, c))
