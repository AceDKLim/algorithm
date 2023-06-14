n = int(input())

result = {}
A = list(input().split())
for i in A:
    result[i] = 0

for _ in range(n):
    A = list(input().split())
    for i in A:
        if i in result:
            result[i] += 1

result = sorted(result.items(), key=lambda x: x[1], reverse=True)
for i in result:
    print(i[0], i[1])
