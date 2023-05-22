n = int(input())

nums = list(map(int, input().split()))

for i in range(n):
    nums[i] = [nums[i], i]
nums.sort()

c = 0
num = nums[0][0]
for i in range(n):
    if nums[i][0] != num:
        c += 1
    num = nums[i][0]
    nums[i][0] = c
nums.sort(key=lambda x: x[1])

for i in range(n):
    print(nums[i][0], end=" ")
