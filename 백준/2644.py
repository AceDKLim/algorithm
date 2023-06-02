def dfs(s, l, n):
    people[s] = n
    for i in l[s]:
        if people[i] == -1:
            dfs(i, l, n + 1)
    return


import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline
n = int(input())

parent = [[] for _ in range(n + 1)]
people = [-1] * (n + 1)
s, e = map(int, input().split())
m = int(input())

for _ in range(m):
    x, y = map(int, input().split())
    parent[x].append(y)
    parent[y].append(x)

dfs(s, parent, 0)
print(people[e])
