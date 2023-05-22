n, m = map(int, input().split())

l = [i for i in range(1, n + 1)]
visit = [0 for _ in range(n + 1)]
result = []
visit[0] = 1


def dfs(num, count, m):
    if count >= m:
        print(num)
        return

    for j in l:
        if visit[j] == 0:
            visit[j] = 1
            if visit[j - 1] == 1:
                dfs(num + " " + str(j), count + 1, m)
            visit[j] = 0


for i in range(1, n + 1):
    visit[i] = 1
    dfs(str(i), 1, m)
    visit[i] = 0
