n, m = map(int, input().split())
num = list(map(int, input().split()))
cnt = 0
for i in range(n):
    sum = 0
    for j in range(i, n):
        sum += num[j]
        if sum % m == 0:
            cnt += 1
print(cnt)
