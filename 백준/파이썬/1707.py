def dfs(l, n, visit):
    visit[n] += 1
    if visit[n] == 2:
        return
    for i in l[n]:
        if visit[i] < 2:
            dfs(l, i, visit)


t = int(input())
for _ in range(t):
    v, e = map(int, input().split())
    l = [[] for _ in range(v + 1)]
    visit = [0] * (v + 1)
    for _ in range(e):
        a, b = map(int, input().split())
        l[a].append(b)
    dfs(l, 1, visit)
    if max(visit) > 1:
        print("NO")
    else:
        print("YES")
