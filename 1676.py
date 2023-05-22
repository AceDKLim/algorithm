n = int(input())
f = 1
for i in range(1, n + 1):
    f *= i
f = list(str(f))

cnt = 0
while 1:
    t = f.pop()
    if t != "0":
        break
    cnt += 1

print(cnt)
