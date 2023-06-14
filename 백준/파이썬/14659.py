n = int(input())
m = list(map(int, input().split()))

result = 0
for i in range(n):
    cnt = 0
    for j in range(i + 1, n):
        if m[j] > m[i]:
            break
        cnt += 1
    result = max(result, cnt)
print(result)
