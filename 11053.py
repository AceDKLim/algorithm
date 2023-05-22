n = int(input())
s = list(map(int, input().split()))

m = min(s)
m_i = s.index(m)
c = 1
for i in range(m_i, n):
    if s[i] > m:
        m = s[i]
        print(m)
        c += 1
print(c)
