from sys import stdin
import heapq

input = stdin.readline
n = int(input())
m = int(input())
bus = [[] for _ in range(n + 1)]

for _ in range(m):
    # start,end,cost
    s, e, c = map(int, input().split())
    bus[s].append((e, c))
s, e = map(int, input().split())
cost = [1e9 for _ in range(n + 1)]

q = []
heapq.heappush(q, (0, s))
cost[s] = 0
while q:
    # cost,now
    c, n = heapq.heappop(q)
    if cost[n] < c:
        continue
    for i in bus[n]:
        newcost = c + i[1]
        if newcost < cost[i[0]]:
            cost[i[0]] = newcost
            heapq.heappush(q, (newcost, i[0]))

print(cost[e])
