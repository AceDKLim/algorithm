# n = int(input())
# k = int(input())
n = 4

l = []
for i in range(1, n + 1):
    for j in range(1, n + 1):
        l.append(i * j)
l.sort()
print(l)
