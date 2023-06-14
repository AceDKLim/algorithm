n = int(input())
stair = [0 for _ in range(n + 1)]
result = [0 for _ in range(n + 1)]
for i in range(1, n + 1):
    stair[i] = int(input())

if n == 1:
    print(stair[1])
elif n == 2:
    print(stair[1] + stair[2])
else:
    result[1] = stair[1]
    result[2] = stair[1] + stair[2]
    for i in range(3, n + 1):
        result[i] = max(result[i - 2] + stair[i], stair[i] + result[i - 3] + stair[i - 1])
    print(result[-1])
