k = int(input())
for _ in range(k):
    v, e = map(int, input().split())
    visit = [0] * (v + 1)
    graph = [[] for _ in range(v + 1)]
    for _ in range(e):
        a, b = map(int, input().split())
        graph[a].append(b)
        print(graph)
    result = "YES"
    for i in range(1, v + 1):
        for j in graph[i]:
            visit[j]
