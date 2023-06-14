n, m = map(int, input().split())
if n == 0:
    b = []
else:
    b = list(map(int, input().split()))
cnt = 0

while b:
    t = []
    n = b.pop()
    if m - n in b:
        b.remove(m - n)
        cnt += 1
    else:
        for i in b:
            if m - n >= i:
                t.append(i)
        if t:
            b.remove(max(t))
        cnt += 1

print(cnt)
