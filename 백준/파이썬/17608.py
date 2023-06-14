from sys import stdin

num = int(stdin.readline().rstrip())
s = []
for _ in range(num):
    n = int(stdin.readline().rstrip())
    s.append(n)

cnt = 1
m = s[-1]
for i in range(num - 1, s.index(max(s)) - 1, -1):
    if s[i] > m:
        cnt += 1
        m = s[i]
print(cnt)
