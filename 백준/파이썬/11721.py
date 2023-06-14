from collections import deque

n = deque(input())

while len(n) >= 10:
    for _ in range(10):
        print(n.popleft(), end="")
    print()
while n:
    print(n.popleft(), end="")
