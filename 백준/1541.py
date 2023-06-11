s = list(input().split("+"))
result = []
for i in range(len(s)):
    if "-" in s[i]:
        s[i] = s[i].split("-")
        for j in range(1, len(s[i])):
            s[i][j] = int(s[i][j]) * -1
        for j in range(len(s[i])):
            result.append(int(s[i][j]))
    else:
        result.append(s[i])


print(result)
