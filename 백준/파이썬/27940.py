n, m, k = map(int, input().split())
farm = 0
cnt = 0
for i in range(m):
    t, r = map(int, input().split())
    if farm <= k:
        farm += r
        cnt += 1

if farm > k:
    print(cnt, 1)
else:
    print(-1)
