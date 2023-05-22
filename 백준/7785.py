from sys import stdin

input = stdin.readline
n = int(input())
giggle = set()
for _ in range(n):
    name, log = map(str, input().split())
    if log == "enter":
        giggle.add(name)
    else:
        giggle.remove(name)

giggle = sorted(giggle)
for i in range(len(giggle) - 1, -1, -1):
    print(giggle[i])
