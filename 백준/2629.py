from collections import deque

w = int(input())
weight = deque(map(int, input().split()))

m = int(input())
marble = list(map(int, input().split()))

s = sum(weight)
dp = [0 for _ in range(s + 1)]
dp[s] = 1


for i in range(w):
    c = weight.popleft()
    t = 0
    for i in weight:
        dp[i] = 1
        dp[abs(i - c)] = 1
        dp[i + c] = 1
    for i in weight:
        t += i
        dp[abs(t - c)] = 1
        dp[t] = 1
        dp[t + c] = 1
    weight.append(c)

for i in marble:
    if i >= len(dp) or dp[i] == 0:
        print("N", end=" ")
    elif dp[i] == 1:
        print("Y", end=" ")
