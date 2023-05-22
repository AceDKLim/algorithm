import math as m

n = int(input())
garo = []
garo_term = []

for i in range(n):
    garo.append(int(input()))
    if i != 0:
        garo_term.append(garo[i] - garo[i - 1])

garo_gcd = garo_term[0]
for i in range(n - 1):
    garo_gcd = m.gcd(garo_gcd, garo_term[i])

print(sum(garo_term) // garo_gcd - len(garo_term))
