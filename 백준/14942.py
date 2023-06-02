def dfs(n, m):
    if n < 0:
        return False
    visit[m] = 1
    for i in road[m]:
        if visit[i[0]] == 0:
            dfs(n - i[1], i[0])
    if m not in result:
        result.append(m)


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline
n = int(input())

ant = [0] + list(int(input()) for _ in range(n))
road = [[] for _ in range(n + 1)]


for _ in range(n - 1):
    a, b, c = map(int, input().split())
    road[a].append((b, c))
    road[b].append((a, c))

for i in range(1, n + 1):
    visit = [0] * (n + 1)
    result = []
    dfs(ant[i], i)
    result.sort()
    print(result[0])
