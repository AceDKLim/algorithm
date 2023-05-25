v, e = map(int, input().split())
k = int(input())
INF = 1e9
graph = [[INF for _ in range(v + 1)] for _ in range(v + 1)]

for _ in range(e):
    u, v, w = map(int, input().split())
    graph[u][v] = w


for i in range(1,v+1):
    for j in range(i,v+1):
        