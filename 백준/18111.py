from sys import stdin
from collections import Counter

input = stdin.readline
n, m, b = map(int, input().split())

land = []
for _ in range(n):
    land += list(map(int, input().split()))
land.sort()

time = 0
while land[0] != land[-1]:
    cnt = Counter(land)
    mi = cnt[land[0]]
    ma = cnt[land[-1]]
    if mi > ma * 2 or mi > b:
        b += ma
        time += 2 * ma
        for i in range(1, ma + 1):
            land[-i] -= 1
    else:
        b -= mi
        time += mi
        for i in range(mi):
            land[i] += 1
print(time, max(land))
