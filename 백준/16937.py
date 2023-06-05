h, w = map(int, input().split())
if h < w:
    h, w = w, h
n = int(input())

sticker = []
for _ in range(n):
    r, c = map(int, input().split())
    if r < c:
        r, c = c, r
    sticker.append((r, c))

result = 0
for i in range(n):
    for j in range(i + 1, n):
        r1, c1 = sticker[i]
        r2, c2 = sticker[j]
        n1 = r1 + r2
        n2 = r1 + c2
        n3 = c1 + r2
        n4 = c1 + c2
        mc = max(c1, c2)
        mr = max(r1, r2)
        if (
            (n1 <= h and mc <= w)
            or (n4 <= w and mr <= h)
            or (n2 <= h and r2 <= w)
            or (n3 <= w and r1 <= h)
            or (n3 <= h and r1 <= w)
            or (n2 <= w and r2 <= h)
            or (n1 <= w and mc <= h)
            or (n4 <= h and mr <= w)
        ):
            result = max(result, r1 * c1 + r2 * c2)
print(result)
