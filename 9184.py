from sys import stdin

input = stdin.readline
l = dict()


def w(a, b, c):
    if (a, b, c) in l:
        return l[(a, b, c)]
    elif a <= 0 or b <= 0 or c <= 0:
        l[(a, b, c)] = 1
        return 1
    elif a > 20 or b > 20 or c > 20:
        l[(a, b, c)] = w(20, 20, 20)
        return w(20, 20, 20)
    elif a < b and b < c:
        d = w(a, b, c - 1)
        e = w(a, b - 1, c - 1)
        f = w(a, b - 1, c)
        l[(a, b, c)] = d + e - f
        return l[(a, b, c)]

    d = w(a - 1, b, c)
    e = w(a - 1, b - 1, c)
    f = w(a - 1, b, c - 1)
    g = w(a - 1, b - 1, c - 1)
    l[(a, b, c)] = d + e + f - g
    return l[(a, b, c)]


for i in range(-50, 51):
    for j in range(-50, 51):
        for k in range(-50, 51):
            w(i, j, k)

while 1:
    a, b, c = map(int, input().split())
    if a == -1 and b == -1 and c == -1:
        break
    print(f"w({a}, {b}, {c}) = {l[(a, b, c)]}")
