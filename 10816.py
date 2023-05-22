dic = {}

n = int(input())
card = tuple(map(str, input().split()))

m = int(input())
nums = tuple(map(str, input().split()))

for i in nums:
    dic[i] = 0

for i in card:
    if i in dic:
        dic[i] += 1

for i in nums:
    print(dic[i], end=" ")
