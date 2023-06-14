from sys import stdin

input = stdin.readline

n, m = map(int, input().split())
result = [0] + list(map(int, input().split()))
remain = [0] * m

for i in range(1, n + 1):
    result[i] = (result[i] + result[i - 1]) % m
    remain[result[i]] += 1

cnt = remain[0]
for i in remain:
    cnt += (i * (i - 1)) // 2

print(cnt)
