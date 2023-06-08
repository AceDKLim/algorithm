n = input()
result = n[0]
for i in range(len(n)):
    if n[i] == "-":
        result += n[i + 1]

print(result)
