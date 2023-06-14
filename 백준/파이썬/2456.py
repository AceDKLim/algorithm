n = int(input())
a = [0, 0, 0, 0]
b = [0, 0, 0, 0]
c = [0, 0, 0, 0]


def draw(n, m, i, j):
    if n[3] < m[3]:
        print(j, m[0])
    elif n[3] > m[3]:
        print(i, n[0])
    elif n[2] < m[2]:
        print(j, m[0])
    elif n[2] > m[2]:
        print(i, n[0])
    else:
        return False


for _ in range(n):
    i, j, k = map(int, input().split())
    a[0] += i
    b[0] += j
    c[0] += k
    a[i] += 1
    b[j] += 1
    c[k] += 1

if a[0] > b[0] and a[0] > c[0]:
    print(1, a[0])
elif b[0] > a[0] and b[0] > c[0]:
    print(2, b[0])
elif c[0] > b[0] and c[0] > a[0]:
    print(3, c[0])
elif a[0] == b[0] and draw(a, b, 1, 2):
    draw(a, b, 1, 2)
elif b[0] == c[0] and draw(b, c, 2, 3):
    draw(b, c, 2, 3)
elif a[0] == c[0] and draw(a, c, 1, 3):
    draw(a, c, 1, 3)
else:
    print(0, max(a[0], b[0], c[0]))
