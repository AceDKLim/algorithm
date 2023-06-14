l = list(range(1, 31))

for _ in range(28):
    n = int(input())
    l.remove(n)

l.sort()
print(l[0])
print(l[1])
