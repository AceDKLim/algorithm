def dfs(i, child):
    global deep
    parent[i] = child
    visit[i] = deep
    for j in g[i]:
        if parent[j] == -1:
            deep += 1
            dfs(j, child + 1)


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline
n, m, r = map(int, input().split())
g = [[] for _ in range(n + 1)]

for _ in range(m):
    x, y = map(int, input().split())
    g[x].append(y)
    g[y].append(x)
for i in g:
    i.sort()

visit = [0 for _ in range(n + 1)]
parent = [-1 for _ in range(n + 1)]

deep = 1
dfs(r, 0)

result = 0
for i in range(1, n + 1):
    result += parent[i] * visit[i]
print(result)
