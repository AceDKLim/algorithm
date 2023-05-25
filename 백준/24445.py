from collections import deque
import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline


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
    graph[v].append(u)

for i in graph:
    i.sort(reverse=1)
bfs(graph, r, visited)
print(*visited[1:], sep="\n")
