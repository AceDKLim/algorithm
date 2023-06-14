n = int(input())
milk = list(map(int, input().split()))

cnt = 1
result = 0
for i in range(n - 1):
    if milk[i] != 2 and milk[i + 1] == milk[i] + 1:
        cnt += 1
    elif milk[i] == 2 and milk[i + 1] == 0:
        cnt += 1
    else:
        result = max(result, cnt)
        cnt = 0

result = max(result, cnt)
print(result)
