t = int(input())
for _ in range(t):
    j, n = map(int, input().split())

    b = []
    for _ in range(n):
        r, c = map(int, input().split())
        b.append(r * c)
    b.sort()

    cnt = 0
    while j > 0:
        j -= b.pop()
        cnt += 1
    print(cnt)
