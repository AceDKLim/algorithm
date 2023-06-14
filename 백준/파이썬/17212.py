n = int(input())
m = [0 for _ in range(n + 1)]

for i in range(1, n + 1):
    m[i] = m[i - 1] + 1
    if i >= 2:
        m[i] = min(m[i], m[i - 2] + 1)
    if i >= 5:
        m[i] = min(m[i], m[i - 5] + 1)
    if i >= 7:
        m[i] = min(m[i], m[i - 7] + 1)

print(m[n])
