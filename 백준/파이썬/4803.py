def dfs(n):
    if visit[n] >= 2:
        return
    visit[n] = 1
    for i in node[n]:
        if visit[i] == 1:
            visit[i] += 1
        dfs(i)
    return


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline

c = 1
while 1:
    # 노드수, 간선수
    n, m = map(int, input().split())
    if n == 0 and m == 0:
        break
    node = [[] for _ in range(n + 1)]
    # 간선 수만큼 입력 받음
    for _ in range(m):
        a, b = map(int, input().split())
        node[a].append(b)
        node[b].append(a)
    # 노드 수만큼 돌며 dfs로 트리 개수 파악
    visit = [-1 for _ in range(n + 1)]
    for i in range(1, n + 1):
        dfs(i)
    print(visit)
    cnt = visit.count(1) + visit.count(-1) - 1

    if cnt == 0:
        print(f"Case {c}: No trees.")
    elif cnt == 1:
        print(f"Case {c}: There is one tree.")
    else:
        print(f"Case {c}: A forest of {cnt} trees.")
    c += 1
