c = list("CAMBRIDGE")
n = input()
result = ""

for i in n:
    if i not in c:
        result += i

print(result)
