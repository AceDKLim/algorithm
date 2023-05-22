from collections import deque

n = int(input())

nums = []
result = []
s = 1

for _ in range(n):
    num = int(input())
    while num >= s:
        nums.append(s)
        result.append("+")
        s += 1
    if nums[-1] == num:
        result.append("-")
        nums.pop()
    else:
        result = []

if len(result) < n:
    print("NO")
else:
    print(*result, sep="\n")
