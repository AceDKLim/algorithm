x = int(input())
num = []
cnt = 0
num.append(x)
while 1 not in num:
    for i in range(len(num)):
        if num[i] % 3 == 0:
            num.append(num[i] // 3)
        if num[i] % 2 == 0:
            num.append(num[i] // 2)
        num.append(num[i] - 1)
    cnt += 1
    num = list(set(num))
print(cnt)
