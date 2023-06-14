n = input()
cnt = 0
while len(n) > 1:
    c = 0
    for i in n:
        c += int(i)
    n = str(c)
    cnt += 1

print(cnt)

if int(n) % 3 == 0:
    print("YES")
else:
    print("NO")
