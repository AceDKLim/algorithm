class Node:
    def __init__(self, data, left, right) -> None:
        self.data = data
        self.left = left
        self.right = right


def dfs(n, m):
    visit[n] = m
    for i in tree[n]:
        a, b = i
        if visit[a] == -1:
            v[a] = n
            dfs(a, b + m)


n = int(input())
tree = [[] for _ in range(n + 1)]
visit = [-1 for _ in range(n + 1)]
for _ in range(n - 1):
    a, b, c = map(int, input().split())
    tree[a].append((b, c))

v = [-1 for _ in range(n + 1)]
dfs(1, 0)
print(visit)
print(v)
