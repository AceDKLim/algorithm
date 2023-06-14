n, m, h = map(int, input().split())
d = (m**2 + h**2) ** 0.5

for i in range(n):
    s = int(input())
    if s <= d:
        print("DA")
    else:
        print("NE")
