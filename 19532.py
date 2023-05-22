a, b, c, d, e, f = map(int, input().split())

if a == 0:
    y = c // b
    x = (f - (y * e)) // d
elif b == 0:
    x = c // a
    y = (f - d * x) // e
elif d == 0:
    y = f // e
    x = (c - (y * b)) // a
elif e == 0:
    x = f // d
    y = (c - a * x) // b
else:
    a, b, c, d, e, f = a * d, b * d, c * d, d * a, e * a, f * a
    if b - e == 0:
        y = 0
        x = c // a
    else:
        y = (c - f) // (b - e)
        x = (c - (y * b)) // a


print(x, y)
