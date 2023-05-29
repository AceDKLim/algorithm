s = list(input())
b = list(input())
result = []

for i in s:
    result.append(i)
    if result[-len(b) :] == b:
        for _ in range(len(b)):
            result.pop()
if result:
    print(*result, sep="")
else:
    print("FRULA")
