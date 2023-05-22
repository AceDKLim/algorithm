from sys import stdin

n, k = map(int, stdin.readline().rstrip().split())
temp = tuple(map(int, stdin.readline().rstrip().split()))
max_sum = []
max_sum.append(sum(temp[0:k]))

for i in range(k, n):
    max_sum.append(max_sum[-1] - temp[i - k] + temp[i])

print(max(max_sum))
