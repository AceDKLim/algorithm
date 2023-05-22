def dfs(graph, v, visit):
    visit[v] = 1
    for i in graph[v]:
        if not visit[i]:
            dfs(graph, i, visit)


com = int(input())
lan = int(input())
coms = [[] for _ in range(com + 1)]
visit = [0] * (com + 1)
for _ in range(lan):
    a, b = map(int, input().split())
    coms[a].append(b)
    coms[b].append(a)

dfs(coms, 1, visit)
print(visit.count(1) - 1)
