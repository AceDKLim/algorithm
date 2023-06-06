a, b = map(int, input().split())
cnt = 1
while b > a:
    if str(b)[-1] == "1":
        b //= 10
        cnt += 1
    elif b % 2 == 0:
        b //= 2
        cnt += 1
    else:
        cnt = -1
        break
if a != b:
    cnt = -1
print(cnt)
