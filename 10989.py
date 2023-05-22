from sys import stdin

n = int(stdin.readline())
l = [0 for _ in range(10001)]
for _ in range(n):
    l[int(stdin.readline())] += 1

for i in range(10001):
    if l[i] != 0:
        for j in range(l[i]):
            print(i)
