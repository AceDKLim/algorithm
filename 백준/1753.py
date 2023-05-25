import heapq

v, e = map(int, input().split())
k = int(input())
INF = 1e9
graph = [[] for _ in range(v + 1)]
distance = [INF] * (v + 1)
for _ in range(e):
    u, v, w = map(int, input().split())
    graph[u].append((v, w))

q = []
heapq.heappush(q, (0, k))

while q:
    d, n = heapq.heappop(q)
    