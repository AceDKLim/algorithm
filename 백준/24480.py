def dfs(v, e, r):
    global cnt
    v[r] = cnt
    for i in e[r]:
        if v[i] == 0:
            cnt += 1
            dfs(visit, l, i)


n, m = map(int, input().split())
l = [[] for _ in range(n + 1)]
visit = [0 for _ in range(n + 1)]
cnt = 1
for i in range(m):
    a, b = map(int, input().split())
    l[a].append(b)

print(l)
# dfs(visit, l, r)

# for i in range(1, n + 1):
#     print(visit[i])
