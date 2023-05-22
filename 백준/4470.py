n = int(input())
l = []
for i in range(n):
    l.append(str(i + 1) + ". " + input())
for i in range(n):
    print(l[i])
