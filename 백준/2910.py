n, c = map(int, input().split())

l = list(input().split())
num = {}
for i in l:
    if i in num:
        num[i] += 1
    else:
        num[i] = 1

num = sorted(num.items(), key=lambda x: -x[1])

for i in num:
    for j in range(i[1]):
        print(i[0], end=" ")
