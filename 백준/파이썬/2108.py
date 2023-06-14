import sys

n = int(sys.stdin.readline().rstrip())
nums = []
d_nums = {}
for _ in range(n):
    num = int(sys.stdin.readline().rstrip())
    if num in d_nums:
        d_nums[num] += 1
    else:
        d_nums[num] = 1
    nums.append(num)

nums.sort()
arithmetic_mean = round(sum(nums) / n)
median = nums[n // 2]
range = nums[-1] - nums[0]


s_nums = sorted(d_nums.keys(), key=lambda x: (-d_nums[x], x))
if len(nums) == 1:
    mode = s_nums[0]
elif nums.count(s_nums[0]) == nums.count(s_nums[1]):
    mode = s_nums[1]
else:
    mode = s_nums[0]

print(arithmetic_mean, median, mode, range, sep="\n")
