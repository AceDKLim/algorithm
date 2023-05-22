from collections import deque

n, m, v = map(int, input().split())

graph = [[] for _ in range(n + 1)]
b_visit = [0] * (n + 1)
d_visit = [0] * (n + 1)
b_result = []
d_result = []
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)
    graph[a].sort()
    graph[b].sort()


def dfs(graph, d_visit, v):
    d_visit[v] = 1
    d_result.append(v)
    for i in graph[v]:
        if not d_visit[i]:
            dfs(graph, d_visit, i)


def bfs(graph, b_visit, v):
    queue = deque([v])
    b_visit[v] = 1
    b_result.append(v)
    while queue:
        n = queue.popleft()
        for i in graph[n]:
            if not b_visit[i]:
                queue.append(i)
                b_visit[i] = 1
                b_result.append(i)


dfs(graph, d_visit, v)
bfs(graph, b_visit, v)
print(*d_result)
print(*b_result)
