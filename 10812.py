n, m = map(int, input().split())

l = list(range(1, n + 1))
for _ in range(m):
    i, j, k = map(int, input().split())
    for _ in range(k - i):
        l.insert(j, l[i - 1])
        l.pop(i - 1)
print(*l)
