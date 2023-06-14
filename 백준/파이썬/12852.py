x = int(input())
count = [0] * (x + 1)
num = [[0], [1]]

for i in range(2, x + 1):
    count[i] = count[i - 1] + 1
    num.append(num[i - 1] + [i])
    if i % 2 == 0:
        if count[i] > count[i // 2] + 1:
            count[i] = count[i // 2] + 1
            num[i] = num[i // 2] + [i]
    if i % 3 == 0:
        if count[i] > count[i // 3] + 1:
            count[i] = count[i // 3] + 1
            num[i] = num[i // 3] + [i]
print(count[x])
s = num[x]
s.reverse()
print(*s)
