n, k = map(int, input().split())

weight = []
value = []
# 무게, 가치순서
for _ in range(n):
    a, b = map(int, input().split())
    weight.append(a)
    value.append(b)

# 해당 무게 최대 가치
dp = [0 for _ in range(k + 1)]

for i in range(n):
    for j in range(k, 0, -1):
        if weight[i] > j:
            continue
        dp[j] = max(dp[j - weight[i]] + value[i], dp[j])

print(dp[k])
