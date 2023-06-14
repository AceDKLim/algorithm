from sys import stdin

input = stdin.readline
l, g, r = map(int, input().split())
lamp = [0 for _ in range(l + 1)]
worker = {}

for _ in range(g):
    name, a, d = input().split()
    worker[name] = (int(a), int(d))

for _ in range(r):
    a, d = worker[input().rstrip()]
    for i in range(a, l + 1, d):
        if lamp[i] == 0:
            lamp[i] = 1
        else:
            lamp[i] = 0

print(lamp.count(1))
