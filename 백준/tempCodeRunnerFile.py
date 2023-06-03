w = int(input())
weight = list(map(int, input().split()))
weight.sort

m = int(input())
marble = list(map(int, input().split()))
s = sum(weight)
dp = [0 for _ in range(s + 1)]

# i로 첨부터 끝까지 돌기
# j로 i랑 다른 추 더하기
# k로 빼기
for i in range(w):
    r = weight[i]
    dp[r] = 1
    for j in range(i + 1, w):
        for k in range(j):
            if weight[j] - weight[k] > 0:
                dp[weight[j] - weight[k]] = 1
            if r - weight[k] > 0:
                dp[r - weight[k]] = 1
        r += weight[j]
        dp[r] = 1

for i in marble:
    if i >= len(dp) or dp[i] == 0:
        print("N", end=" ")
    elif dp[i] == 1:
        print("Y", end=" ")
