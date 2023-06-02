def dfs(n):
    if visit[n] == 1:
        return False
    visit[n] = 1
    for i in graph[n]:
        if visit[i] == 0:
            dfs(i)
    return True


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline
n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]
visit = [0] * (n + 1)
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

cnt = 0
for i in range(1, n + 1):
    if dfs(i):
        cnt += 1
print(cnt)
