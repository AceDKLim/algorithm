def check(x, cnt, result):
    if x > n - 1:
        return 1e9
    if cnt == k:
        return result + student[n - 1] - student[x]
    m = 1e9
    for i in range(x, x + k - 1):
        m = min(m, check(i + 1, cnt + 1, result + student[i] - student[x]))
    return m


import sys

sys.setrecursionlimit(10**6)
n, k = map(int, input().split())
student = list(map(int, input().split()))


print(check(0, 1, 0))
