n = int(input())
first = {}
for _ in range(n):
    name = input()
    if name[0] in first:
        first[name[0]] += 1
    else:
        first[name[0]] = 1

result = ""
for i in first.keys():
    if first[i] >= 5:
        result += i

if result:
    print(*sorted(result), sep="")
else:
    print("PREDAJA")
