def dfs(n):
    for i in tree[n]:
        if parent[i] == INF:
            parent[i] = n
            dfs(i)


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline
n = int(input())
INF = 1e9
tree = [[] for _ in range(n + 1)]
parent = [INF] * (n + 1)
for i in range(n - 1):
    x, y = map(int, input().split())
    tree[x].append(y)
    tree[y].append(x)

dfs(1)

print(*parent[2:], sep="\n")
