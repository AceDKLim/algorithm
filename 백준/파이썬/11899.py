g = input()
result = []

for i in g:
    if i == ")" and result and result[-1] == "(":
        result.pop()
    else:
        result.append(i)
print(len(result))
