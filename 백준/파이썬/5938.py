n, m = map(int, input().split())


def dfs(c):
    for i in cow[c]:
        if visit[i] == 0:
            visit[i] = 1
            dfs(i)


cow = [[] for _ in range(n + 1)]
visit = [0] * (n + 1)
result = []
for _ in range(m):
    a, b = map(int, input().split())
    cow[a].append(b)
    cow[b].append(a)
if n == 1:
    print(0)
else:
    dfs(1)
    for i in range(2, n + 1):
        if visit[i] == 0:
            result.append(i)

    if len(result) == 0:
        print(0)
    else:
        print(*result, sep="\n")
