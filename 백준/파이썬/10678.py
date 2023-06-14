def bfs(arr, k, s):
    if k == n:
        result.append(s)
    visit[k] == 1
    for i in arr[k]:
        if visit[i[0]] == 0:
            bfs(arr, i[0], s + i[1])


n, m = map(int, input().split())

B = [[] for _ in range(n + 1)]
E = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b, c, d = map(int, input().split())
    B[a].append((b, c))
    E[a].append((b, d))

result = []
visit = [0] * (n + 1)
bfs(B, 1, 0)
br = result
result = []
visit = [0] * (n + 1)
bfs(E, 1, 0)

r = "IMPOSSIBLE"
br.sort(reverse=1)
for i in br:
    if i in result:
        r = i
print(r)
