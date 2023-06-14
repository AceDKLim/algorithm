from sys import stdin

input = stdin.readline

n, m = map(int, input().split())
order = list(tuple(map(int, input().split())) for _ in range(n))
sushi = list(map(int, input().split()))
result = [0 for _ in range(n)]

for i in sushi:
    for j in range(n):
        if i in order[j][1:]:
            result[j] += 1
            break

print(*result)
