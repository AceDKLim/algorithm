from collections import deque

s = deque(input())
result = deque()
cal = list("+-/*()")
while s:
    n = s.pop()
    if n in cal:
        result.append(n)
    else:
        result.appendleft(n)

print(result)
