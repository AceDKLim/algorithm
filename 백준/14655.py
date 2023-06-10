n = int(input())

score = 0
f = list(map(int, input().split()))
s = list(map(int, input().split()))

for i in range(n):
    score += abs(f[i])
    score += abs(s[i])

print(score)
