n, m = map(int, input().split())

A = []
for _ in range(n):
    A.append(list(map(int, input().split())))


def multi_procession(q, r):
    result = [[0 for _ in range(n)] for _ in range(n)]
    for i in range(n):
        for j in range(n):
            for p in range(n):
                result[i][p] += r[i][j] * q[j][p]
                result[i][p] %= 1000
    return result


def multy(n, p):
    if n == 1:
        return p
    h_p = multy(n // 2, p)
    if n % 2 == 0:
        return multi_procession(h_p, h_p)
    else:
        return multi_procession(multi_procession(h_p, h_p), p)


for i in multy(m, A):
    for j in i:
        print(j % 1000, end=" ")
    print()
