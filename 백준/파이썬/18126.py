def dfs(d):
    print(result)
    print(visit)
    visit[d] = 1
    for i in road[d]:
        a, b = i
        result[a] = min(result[a], result[d] + b)
        if visit[a] == 0:
            dfs(a)


import sys
from collections import deque


sys.setrecursionlimit(10**6)
n = int(input())

road = [[] for _ in range(n + 1)]
visit = [0 for _ in range(n + 1)]
result = [1e9 for _ in range(n + 1)]
result[1] = 0
for _ in range(n - 1):
    a, b, c = map(int, input().split())
    road[a].append((b, c))
    road[b].append((a, c))

dfs(1)
print(max(result[1:]))
