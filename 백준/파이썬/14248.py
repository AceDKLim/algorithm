def dfs(t):
    visit[t] = 1
    for i in range(2):
        nx = t + (b[t] * dx[i])
        if nx < 0 or nx >= n:
            continue
        if visit[nx] == 0:
            dfs(nx)


n = int(input())
b = list(map(int, input().split()))
visit = [0 for _ in range(n)]
s = int(input())

dx = [1, -1]

dfs(s - 1)
print(visit.count(1))
