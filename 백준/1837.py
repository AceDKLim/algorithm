p, k = map(int, input().split())
result = ["GOOD"]
for i in range(2, k):
    if p % i == 0:
        result = ["BAD", i]
        break

print(*result)
