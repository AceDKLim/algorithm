def dfs(n, m):
    visit[n] = m
    for i in tree[n]:
        x, y = i
        if visit[x] == -1:
            dfs(x, y + m)


v = int(input())
tree = [[] for _ in range(v + 1)]
visit = [-1 for _ in range(v + 1)]

for _ in range(v):
    n = list(map(int, input().split()))
    n.pop()
    for i in range(1, len(n), 2):
        tree[n[0]].append((n[i], n[i + 1]))
dfs(1, 0)

n = visit.index(max(visit))
visit = [-1 for _ in range(v + 1)]
dfs(n, 0)
print(max(visit))
