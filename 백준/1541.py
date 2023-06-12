s = list(input())


result = 0
n = ""
t = 1
for i in s:
    if i == "+" or i == "-":
        result += int(n) * t
        n = ""
    if i == "-":
        t = -1
    else:
        n += i


print(result + int(n) * t)
