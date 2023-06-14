from collections import deque

n, k = map(int, input().split())
road = [1e9] * (100001)

road[n] = 0
q = deque([n])

while q:
    t = q.popleft()
    for i in [t - 1, t + 1, t * 2]:
        if i > 100000 or i < 0:
            continue
        if road[i] >= road[t] + 1:
            q.append(i)
            road[i] = road[t] + 1
print(road[k])
