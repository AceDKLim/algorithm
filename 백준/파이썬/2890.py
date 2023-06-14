num = list("123456789F")
from collections import deque

r, c = map(int, input().split())
mem = []
for _ in range(r):
    s = deque(input())
    t = s.popleft()
    while t not in num:
        t = s.popleft()
    if t != "F":
        mem.append([int(t), len(s)])
mem = sorted(mem, key=lambda x: x[1])
grade = 1
mem[0].append(grade)
for i in range(1, 9):
    if mem[i - 1][1] < mem[i][1]:
        grade += 1
    mem[i].append(grade)
mem.sort()
for i in range(9):
    print(mem[i][2])
