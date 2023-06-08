n = int(input())
num = list(map(int, input().split()))

result = [num[i] for i in range(n)]
for i in range(n):
    for j in range(i):
        if num[j] < num[i]:
            result[i] = max(result[i], result[j] + num[i])


print(max(result))
