n = int(input())
t = 1

while t < n:
    t *= 2

cnt = 0
choco = 0
r = t
while 1:
    if n == t or choco == n:
        break
    elif n > choco:
        t //= 2
        choco += t
        cnt += 1
    elif n < choco:
        t //= 2
        choco -= t
        cnt += 1
print(r, cnt)
