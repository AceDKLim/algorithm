from sys import stdin

n, m = map(int, stdin.readline().split())

d = {}
for i in range(n):
    val = stdin.readline().rstrip()
    d[str(i + 1)] = val
    d[val] = str(i + 1)

for _ in range(m):
    print(d.get(stdin.readline().rstrip()))
