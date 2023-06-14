from collections import deque

n = deque(input())
result = []

while n:
    result.append("".join(n))
    n.popleft()

result.sort()
print(*result, sep="\n")
