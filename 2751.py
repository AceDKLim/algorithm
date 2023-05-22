from sys import stdin

n = int(stdin.readline())
l = []
for _ in range(n):
    l.append(int(stdin.readline()))
l.sort()

for i in range(n):
    print(l[i])
