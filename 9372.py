t = int(input())


def dfs(graph, v, visit):
    visit[v] = 1
    for i in graph[v]:
        if not visit[i]:
            global cnt
            cnt += 1
            dfs(graph, i, visit)


for _ in range(t):
    n, m = map(int, input().split())
    visit = [0] * (n + 1)
    travel = [[0] * (n + 1) for _ in range(n + 1)]
    cnt = 0
    for _ in range(m):
        a, b = map(int, input().split())
        travel[a].append(b)
        travel[b].append(a)
    dfs(travel, 1, visit)
    print(cnt - 1)
