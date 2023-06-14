from sys import stdin

input = stdin.readline

n = int(input())
nl = list(input().rsplit() for _ in range(n))

m = int(input())
ml = []

for _ in range(m):
    t = input().rsplit()
    if t in nl:
        ml.append(t)
print(len(ml))
