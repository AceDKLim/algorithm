a, b = map(int, input().split())

r1 = int(-a + (a**2 - b) ** 0.5)
r2 = int(-a - (a**2 - b) ** 0.5)
if r1 < r2:
    print(r1, r2)
elif r2 < r1:
    print(r2, r1)
else:
    print(r1)
