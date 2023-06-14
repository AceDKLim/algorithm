p, n = map(int, input().split())

s = list(map(int, input().split()))
s.sort(reverse=1)

cnt = 0
while p < 200 and s:
    p += s.pop()
    cnt += 1

print(cnt)
