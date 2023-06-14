string = input()
num = []
l = len(string)
for i in range(l):
    num.append((string[i], i))

result = ["" for _ in range(l)]
num.sort()

for i in range(l):
    result[num[i][1]] = string[num[i][1]]
    print("".join(result))
