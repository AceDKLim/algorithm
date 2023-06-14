n = int(input())
nums = []
for _ in range(n):
    nums.append(list(map(int, input().split())))
nums = sorted(nums, key=lambda x: (x[0], x[1]))

for i in range(n):
    print(*nums[i])
