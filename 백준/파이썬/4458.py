n = int(input())

for _ in range(n):
    t = list(input())
    t[0] = t[0].upper()
    print(*t, sep="")
