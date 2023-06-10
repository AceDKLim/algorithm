from collections import deque

n = int(input())
m = deque(sorted(map(int, input().split())))
cnt = 1
n = m.popleft()
while m:
    t = m.popleft()
    if t <= n:
        m.append(t)
    if m and max(m) <= t:
        n = m.popleft()
        cnt += 1
    else:
        n = t
print(cnt)
