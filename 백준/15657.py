def dfs(i, c, r):
    r += str(num[i]) + " "
    if c == m:
        print(r)
        return
    for j in range(n):
        if visit[j] == 0:
            dfs(j, c + 1, r)
        visit[j] = 1


n, m = map(int, input().split())
num = list(map(int, input().split()))
num.sort()


for i in range(n):
    visit = [0 for _ in range(n)]
    for j in range(i):
        visit[j] = 1
    dfs(i, 1, "")
