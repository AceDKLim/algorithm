def dfs(n, k):
    if visit[n] == 0:
        visit[n] = k
    for i in graph[n]:
        if visit[i] == 0:
            dfs(i, k)
    return


import sys

sys.setrecursionlimit(10**6)

n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]
visit = [0] * (n + 1)
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)
for i in range(n + 1):
    dfs(i, i)
print(len(set(visit)) - 1)
