n = int(input())
drink = [0]
result = [0 for _ in range(n + 1)]
for _ in range(n):
    drink.append(int(input()))

if n >= 1:
    result[1] = drink[1]
if n >= 2:
    result[2] = drink[1] + drink[2]
if n >= 3:
    result[3] = max(result[2], drink[1] + drink[3], drink[2] + drink[3])
    if n >= 4:
        for i in range(4, n + 1):
            result[i] = max(
                result[i - 3] + drink[i - 1] + drink[i],
                result[i - 2] + drink[i],
                result[i - 1],
            )
print(result[n])
