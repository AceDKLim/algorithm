s = input()
result = []

n = s[0]
for i in s:
    if i != n:
        result.append(n)
    n = i
result.append(i)
print(min(result.count("0"), result.count("1")))
