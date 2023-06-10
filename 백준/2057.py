n = int(input())

fact = [0, 1]
i = 2
while fact[i - 1] < n:
    fact.append(i * fact[i - 1])
    i += 1
result = "NO"
for i in fact:
    if n - i in fact:
        result = "YES"
        break
print(result)
