n = int(input())
a = tuple(map(int, input().split()))

cnt = {}
for i in a:
    if i in cnt:
        cnt[i] += 1
    else:
        cnt[i] = 1

for i in range(n-1,-1,-1):
    c=cnt[i]
    for j in range(i-1,-1,-1):
        if 