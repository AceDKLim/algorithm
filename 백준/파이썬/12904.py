from collections import deque

s = input()
t = input()
result = deque()

result.append(s + "A")
result.append(s[::-1] + "B")
e = len(result)
while len(result[-1]) != len(t):
    for i in range(e):
        result.append(result[i] + "A")
        result.append(result[i][::-1] + "B")
    for _ in range(e):
        result.popleft()
    e = len(result)
if t in result:
    print(1)
else:
    print(0)
