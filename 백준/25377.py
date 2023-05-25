n = int(input())

result = []
for _ in range(n):
    a, b = map(int, input().split())
    if a <= b:
        result.append(b)

if len(result) == 0:
    print(-1)
else:
    print(min(result))
