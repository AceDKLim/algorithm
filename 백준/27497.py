from collections import deque
from sys import stdin

n = int(input())

result = deque()
cal = deque()
for _ in range(n):
    t = list(input().rsplit())
    if t[0] == "1":
        result.append(t[1])
        cal.append(1)
    if t[0] == "2":
        result.appendleft(t[1])
        cal.append(2)
    if t[0] == "3" and result:
        c = cal.pop()
        if c == 2:
            result.popleft()
        else:
            result.pop()

if result:
    print(*result, sep="")
else:
    print(0)
