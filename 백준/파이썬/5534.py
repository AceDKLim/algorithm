n = int(input())
g = input()

cnt = 0
for _ in range(n):
    t = input()
    n = 0
    for i in g:
        if g.count(i) <= t.count(i):
            n += 1
    if n == len(g):
        cnt += 1
print(cnt)
