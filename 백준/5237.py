def dfs(m):
    visit[m] = 1
    for i in connect[m]:
        if visit[i] == 0:
            dfs(i)


n = int(input())

for _ in range(n):
    l = list(map(int, input().split()))
    a, b = l[0], l[1]
    connect = [[] for _ in range(a)]
    visit = [0] * a
    for i in range(2, b * 2 + 1, 2):
        connect[l[i]].append(l[i + 1])
        connect[l[i + 1]].append(l[i])
    dfs(0)
    if 0 in visit:
        print("Not connected.")
    else:
        print("Connected.")
