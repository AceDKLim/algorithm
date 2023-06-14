n = int(input())
num = list(map(int, input().split()))

result = 0
for i in range(n):
    min_cnt = 0
    max_cnt = 0
    check = num[i]
    for j in range(i, n):
        if check > num[j]:
            max_cnt += 1
            result = max(min_cnt, result)
            min_cnt = 0
        elif check < num[j]:
            min_cnt += 1
            result = max(max_cnt, result)
            max_cnt = 0
        else:
            min_cnt += 1
            max_cnt += 1
        check = num[j]

print(result)
