n = int(input())
s = list(map(int, input().split()))

cnt = 0
for i in range(1, n + 1):
    if i != s[i - 1]:
        cnt += 1
print(cnt)
