n, m = map(int, input().split())

A = []
for _ in range(n):
    A.append(list(map(int, input().split())))

m, k = map(int, input().split())
B = []
for _ in range(m):
    B.append(list(map(int, input().split())))

result = [[0 for _ in range(k)] for _ in range(n)]

for i in range(n):
    for j in range(m):
        for p in range(k):
            result[i][p] += A[i][j] * B[j][p]

for i in result:
    print(*i)
