from collections import deque

t = int(input())
for _ in range(t):
    cnt = 0
    a, b = map(int, input().split())
    q = deque(list(map(int, input().split())))
    while b > -1:
        if max(q) == q[0]:
            q.popleft()
            cnt += 1
            b -= 1
        else:
            if b == 0:
                b += len(q) - 1
            else:
                b -= 1
            q.append(q.popleft())
    print(cnt)
