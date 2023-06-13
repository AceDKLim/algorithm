import heapq
from sys import stdin

input = stdin.readline

# v->노드 수, e->간선 수, k->시작 노드
V, e = map(int, input().split())
INF = 1e9

# 노드별 간격, 시작지점과 거리
graph = [[] for _ in range(V + 1)]
distance = [INF] * (V + 1)

# u에서 v 거리 w
# v에서 u 거리 w
for _ in range(e):
    u, v, w = map(int, input().split())
    graph[u].append((v, w))
    graph[v].append((u, w))

# 반드시 통과 정점 두개
