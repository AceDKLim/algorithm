from collections import deque


def bfs(graph, start, visited):
    queue = deque([start])
    cnt = 2
    visited[start] = 1
    while queue:
        v = queue.popleft()
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = cnt
                cnt += 1


n, m, r = map(int, input().split())
visited = [0] * (n + 1)
graph = [[] for _ in range(n + 1)]
for _ in range(m):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[u].sort()
bfs(graph, r, visited)
print(*visited[1:], sep="\n")
