result = []
string = list(input())
for i in range(1, len(string) - 1):
    for j in range(i + 1, len(string)):
        a = string[:i]
        b = string[i:j]
        c = string[j:]
        result.append("".join(a[::-1] + b[::-1] + c[::-1]))

print(sorted(result)[0])
