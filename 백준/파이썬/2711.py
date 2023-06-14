t = int(input())
for _ in range(t):
    a, b = input().split()
    a = int(a) - 1
    b = list(b)
    b.pop(a)
    print(*b, sep="")
