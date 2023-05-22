a, b, c = map(int, input().split())

m = max(a, b, c)
s = a + b + c
if m >= s - m:
    print(2 * (s - m) - 1)
else:
    print(s)
