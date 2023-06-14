d, h, m = map(int, input().split())

dt = 24 * 60 * (d - 11)
ht = 60 * (h - 11)
mt = m - 11
t = dt + ht + mt
if t < 0:
    print(-1)
else:
    print(t)
