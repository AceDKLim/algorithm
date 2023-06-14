import heapq
from sys import stdin

input = stdin.readline

# v->노드 수, e->간선 수, k->시작 노드
V, e = map(int, input().split())
k = int(input())
INF = 1e9

# 노드별 간격, 시작지점과 거리
graph = [[] for _ in range(V + 1)]
distance = [INF] * (V + 1)

for _ in range(e):
    u, v, w = map(int, input().split())
    graph[u].append((v, w))

q = []
heapq.heappush(q, (0, k))
distance[k] = 0
while q:
    # d->거리, n->간선
    d, n = heapq.heappop(q)
    if distance[n] < d:
        continue
    for i in graph[n]:
        u, v = i
        s = d + v
        if distance[u] > s:
            distance[u] = s
            heapq.heappush(q, (s, u))

for i in range(1, V + 1):
    if distance[i] != INF:
        print(distance[i])
    else:
        print("INF")
