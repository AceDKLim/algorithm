n = int(input())
stair = []
for _ in range(n):
    stair.append(int(input()))
stair.reverse()
stair.append(0)
cnt = 1
i = 0
result = stair[0]
while i < n - 1:
    if (result + stair[i + 1] < result + stair[i + 2]) or cnt == 2:
        result += stair[i + 2]
        i += 2
        cnt = 1
    else:
        result += stair[i + 1]
        i += 1
        cnt += 1

print(result)
