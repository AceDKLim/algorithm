n = int(input())
tree = [[] for _ in range(101)]
visit = [0 for _ in range(101)]
while True:
    s = list(map(int, input().split()))
    if len(s) == 1 and s[0] == -1:
        break
    for i in range(1, len(s)):
        tree[s[0]].append(s[i])
        tree[s[i]].append(s[0])


def dfs(n):
    visit[n] = 1
    print(n)
    for i in tree[n]:
        dfs(i)


dfs(n)
