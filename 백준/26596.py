n = int(input())
bomb = {}

for _ in range(n):
    a, b = input().split()
    if a in bomb:
        bomb[a] += int(b)
    else:
        bomb[a] = int(b)

key = list(bomb.keys())
n = len(key)
result = "Not Delicious..."
for i in range(n):
    for j in range(i + 1, n):
        if int(bomb[key[i]] * 1.618) == bomb[key[j]] or int(bomb[key[j]] * 1.618) == bomb[key[i]]:
            result = "Delicious!"
            break
print(result)
