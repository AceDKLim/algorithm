n = list(map(int, input().split()))
n.sort()
a, b, c = n

if a == b and b == c:
    print(2)
elif c**2 == a**2 + b**2:
    print(1)
else:
    print(0)
