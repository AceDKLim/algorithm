import heapq
from sys import stdin

input = stdin.readline

n = int(input())

min_hip = []

for _ in range(n):
    c = int(input())
    if c == 0:
        try:
            print(heapq.heappop(min_hip))
        except:
            print(0)
    else:
        heapq.heappush(min_hip, c)
