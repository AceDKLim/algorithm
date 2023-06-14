n = int(input())
l = list(map(int, input().split()))

cnt = 0
for i in range(n):
    if l[i - 1] >= l[i]:
        cnt += 1

print(cnt)
