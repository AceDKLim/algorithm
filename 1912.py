from sys import stdin

input = stdin.readline
n = int(input())
li = list(map(int, input().split()))


def max_sum(l, r):
    if l > r:
        return -1001
    if l == r:
        return max(-1001, li[l])
    m = (l + r) // 2
    lmax = -1001
    sum = 0
    for i in range(m, l - 1, -1):
        sum += li[i]
        lmax = max(lmax, sum)
    print(l, m, lmax)
    rmax = -1001
    sum = 0
    for i in range(m + 1, r + 1):
        sum += li[i]
        rmax = max(rmax, sum)
    print(m + 1, r, lmax)
    return max(lmax + rmax, max_sum(l, m), max_sum(m + 1, r))


print(max_sum(0, n - 1))
