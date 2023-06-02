def dfs(t):
    visit[t] = 1
    for i in node[t]:
        if visit[i] == 0:
            dfs(i)


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline
n, m = map(int, input().split())
node = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    node[a].append(b)

result = "Yes"
for i in range(1, n + 1):
    visit = [1] + [0] * (n)
    dfs(i)
    if 0 in visit:
        result = "No"
        break
print(result)
