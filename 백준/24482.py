def dfs(graph, r, n):
    visit[r] = n
    for i in graph[r]:
        if visit[i] == -1:
            dfs(graph, i, n + 1)


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n, m, r = map(int, input().split())
visit = [-1 for _ in range(n + 1)]
graph = [[] for _ in range(n + 1)]
for _ in range(m):
    a, b = map(int, input().split())
    graph[b].append(a)
    graph[a].append(b)
for i in graph:
    i.sort(reverse=1)
dfs(graph, r, 0)
print(*visit[1:], sep="\n")
