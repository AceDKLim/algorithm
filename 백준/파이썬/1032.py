n = int(input())
t = []
for _ in range(n):
    t.append(list(input()))

result = ""
for i in range(len(t[0])):
    c = t[0][i]
    for j in range(1, n):
        if c != t[j][i]:
            c = "?"
            break
    result += c

print(result)
