from collections import deque

n, m = map(int, input().split())

miro = []
for _ in range(n):
    miro.append(list(input()))


dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]
visit = deque()

visit.append((0, 0))
