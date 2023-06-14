import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline
# n-> 노드 개수, m-> 간선 개수 r->시작 정점
n, m, r = map(int, input().split())
l = [[] for _ in range(n + 1)]
visit = [0 for _ in range(n + 1)]
cnt = 1

for i in range(m):
    a, b = map(int, input().split())
    l[a].append(b)
    l[b].append(a)

for i in l:
    i.sort(reverse=1)


# v-> 정점집합, r->시작 정점
def dfs(v, r):
    global cnt
    visit[r] = cnt
    cnt += 1
    for i in v[r]:
        if visit[i] == 0:
            dfs(v, i)


dfs(l, r)

for i in range(1, n + 1):
    print(visit[i])
