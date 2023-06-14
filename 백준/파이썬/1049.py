n, m = map(int, input().split())
mp = 1e9
mo = 1e9
for _ in range(m):
    a, b = map(int, input().split())
    mp = min(mp, a)
    mo = min(mo, b)

s = n // 6
result = min(mp * (s + 1), mo * n, ((n - (s * 6)) * mo + mp * s))
print(result)
