import math as m

a1, p1 = map(int, input().split())
r, p2 = map(int, input().split())

a1 = a1 / p1
a2 = (r**2 * m.pi) / p2

if a1 > a2:
    print("Slice of pizza")
else:
    print("Whole pizza")
