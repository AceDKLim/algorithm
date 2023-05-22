from sys import stdin

input = stdin.readline

n, m = map(int, input().split())
non_see = set()
non_see_hear = set()

for _ in range(n):
    non_see.add(input())

for _ in range(m):
    name = input()
    if name in non_see:
        non_see_hear.add(name)

print(len(non_see_hear))
non_see_hear = sorted(non_see_hear)
for i in range(len(non_see_hear)):
    print(non_see_hear[i], end="")
