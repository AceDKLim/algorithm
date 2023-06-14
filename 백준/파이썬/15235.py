from collections import deque

n = int(input())

pizza = deque(map(int, input().split()))
person = deque(i for i in range(n))
result = [0 for _ in range(n)]

cnt = 1
while pizza:
    pi = pizza.popleft()
    pe = person.popleft()
    if pi - 1 == 0:
        result[pe] = cnt
    else:
        pizza.append(pi - 1)
        person.append(pe)
    cnt += 1

print(*result)
